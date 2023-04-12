package com.tns.PlacementService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlacementServices {
	
	@Autowired
	
	private PlacementServiceRepository repo;
	public List <Placement> listAll()
	{
		return repo.findAll();
	}
	public Placement get(Integer pl_id)
	{
		return repo.findById(pl_id).get();
	}
	public void delete(Integer pl_id)
	{
		repo.deleteById(pl_id);
	}
	public void save (Placement plm)
	{
		repo.save(plm);
	}


}
