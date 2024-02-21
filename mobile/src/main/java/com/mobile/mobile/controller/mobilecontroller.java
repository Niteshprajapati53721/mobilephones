package com.mobile.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.mobile.model.mobile;
import com.mobile.mobile.service.mobileservice;
import com.mobile.mobile.service.serviceinterface;

@RestController
@CrossOrigin("*")
public class mobilecontroller {
	
	@Autowired
   serviceinterface service;

	
	@GetMapping("/getmobile")
	public List<mobile> getmobiles()
	{
		return service.getmobile();
	}
	@PostMapping("/addmobile")
	public List<mobile> addmobile(@RequestBody mobile mobile)
	{
		return service.addmobile(mobile);
	}
	
	@PutMapping("/updatemobile/{id}")
	public ResponseEntity< mobile> updatemobile(@PathVariable("id")int id,@RequestBody mobile mobile)
	{
		
		
		return service.updatemobile(id,mobile);
		
	}
	
	@DeleteMapping("/deletemobile/{id}")
	public List<mobile> deletemobile(@PathVariable("id") int id)
	{
		return service.deletemobile(id);
	}
	@GetMapping("/getmobilebyid/{id}")
	public mobile getmobile(@PathVariable("id") int id)
	{
		return service.getmobilebyid(id);
	}
}
