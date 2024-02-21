package com.mobile.mobile.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mobile.mobile.model.mobile;


public interface serviceinterface {

	List<mobile> getmobile();

	List<mobile> addmobile(mobile mobile);


	List<mobile> deletemobile(int id);

	mobile getmobilebyid(int id);

	ResponseEntity<mobile> updatemobile(int id, mobile mobile);
	



}
