package com.tns.PlacementService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Placement {
	
	private Integer placementcell_Id;
	private String placement_officer;
	private String institute_name;
	private String student_name;
	private Integer std_id;
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(Integer placementcell_Id, String placement_officer, String institute_name, String student_name,
			Integer std_id) {
		super();
		this.placementcell_Id = placementcell_Id;
		this.placement_officer = placement_officer;
		this.institute_name = institute_name;
		this.student_name = student_name;
		this.std_id = std_id;
	}
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public Integer getPlacementcell_Id() {
		return placementcell_Id;
	}
	public void setPlacementcell_Id(Integer placementcell_Id) {
		this.placementcell_Id = placementcell_Id;
	}
	public String getPlacement_officer() {
		return placement_officer;
	}
	public void setPlacement_officer(String placement_officer) {
		this.placement_officer = placement_officer;
	}
	public String getInstitute_name() {
		return institute_name;
	}
	public void setInstitute_name(String institute_name) {
		this.institute_name = institute_name;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Integer getStd_id() {
		return std_id;
	}
	public void setStd_id(Integer std_id) {
		this.std_id = std_id;
	}
	@Override
	public String toString() {
		return "Placement [placementcell_Id=" + placementcell_Id + ", placement_officer=" + placement_officer
				+ ", institute_name=" + institute_name + ", student_name=" + student_name + ", std_id=" + std_id + "]";
	}
	
	

}
