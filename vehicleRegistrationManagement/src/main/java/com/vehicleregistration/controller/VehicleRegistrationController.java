package com.vehicleregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleregistration.service.VehicleRegistrationService;

@RestController
public class VehicleRegistrationController {
	
	@Autowired
	VehicleRegistrationService vehicleRegistrationService;

	//get all, get a specific vehicle registration,new vehicle,delete a vehicle registration, updating
	@GetMapping(path="/getVehicleRegistration/{serialNumber}")
	public String getVehicleRegistration(@PathVariable("serialNumber") String serialNumber){
		return vehicleRegistrationService.findOne(serialNumber).getState().getStateName();
	}
}
