package com.mobile.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mobile.mobile.model.mobile;
import com.mobile.mobile.repository.mobilerepository;

@Service
public class mobileservice  implements serviceinterface{
	
	@Autowired
	mobilerepository repo;
	@Override
	public List<mobile> getmobile() {
		return repo.findAll();
	}
	@Override
	public List<mobile> addmobile(mobile mobile) {
		repo.save(mobile);
		return repo.findAll();
	}

	
	@Override
	public List<mobile> deletemobile(int id) {
		if(repo.findById(id).isPresent()==true)
		{
			repo.deleteById(id);
			return repo.findAll();
			
		}
		else
		{
			return null;
		}
		
	}
	@Override
	public ResponseEntity<mobile> updatemobile(int id, mobile mobile) {
		mobile mob;
		if(repo.findById(id).isPresent()==true)
		{
		
			mob=repo.findById(id).get();
			mob.setId(id);
			mob.setModel(mobile.getModel());
			mob.setName(mobile.getName());
			mob.setPrice(mobile.getPrice());
			repo.save(mob);
			mobile updatedmobile= repo.save(mob);
			return ResponseEntity.status(HttpStatus.OK).body(updatedmobile);
		
		}
		else {
			
			return null;
		}
	
	}
	@Override
	public mobile getmobilebyid(int id) {
		if(repo.findById(id).isPresent()==true)
		{
			mobile mobile;
			mobile=repo.findById(id).get();
			return mobile;
			
				
			}
		else
		{
		return null;
	}
	
}
}
