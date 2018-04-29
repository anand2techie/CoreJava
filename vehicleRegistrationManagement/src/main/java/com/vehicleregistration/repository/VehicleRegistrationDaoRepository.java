package com.vehicleregistration.repository;

import org.springframework.data.repository.CrudRepository;

import com.vehicleregistration.entity.VehicleRegistration;

public interface VehicleRegistrationDaoRepository extends CrudRepository<VehicleRegistration, Integer>{
	
	//findBy+variableName in that class.
	//customizing the findBy operation.
	//default findBy operation - findById()
	VehicleRegistration findBySerialNumber(String serialNumber);

}
