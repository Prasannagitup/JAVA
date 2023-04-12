package com.tns.PlacementService;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
public class PlacementServicesController {

	@Autowired
	private PlacementServices a;
	
	
	@GetMapping(("/PlacementServices"))
	public List<Placement> list()
	{
		return a.listAll();
	}
	@GetMapping("/ShopOwnerServices/(sh_id)")
	public ResponseEntity<Placement> get (@PathVariable Integer pl_id)
	{
		try
		{
			Placement pl=a.get(pl_id);
			return new ResponseEntity<Placement>(pl,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/PlacementServices")
	public void add(@RequestBody Placement plm)
	{
		a.save(plm);
	}
	@PutMapping("/PlacementServices/(pl_id)")
	public ResponseEntity<?> update(@RequestBody Placement plm,@PathVariable Integer pl_id)
	{
		Placement existshopowner=a.get(pl_id);
		a.save(plm);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/PlacementServices/(ad_id)")
	public void delete (@PathVariable Integer pl_id)
	{
		a.delete(pl_id);
	}

}
