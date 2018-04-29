package com.vehicleregistration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.vehicleregistration.entity.VehicleRegistration;
import com.vehicleregistration.entity.VehicleRegistrationMongo;

public interface VehicleRegistrationDaoMongoRepository extends MongoRepository<VehicleRegistrationMongo, Integer>{
	
	//findBy+variableName in that class.
	//customizing the findBy operation.
	//default findBy operation - findById()
	VehicleRegistration findBySerialNumber(String serialNumber);

}
