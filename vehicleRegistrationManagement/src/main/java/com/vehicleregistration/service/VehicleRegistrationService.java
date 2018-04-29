package com.vehicleregistration.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vehicleregistration.entity.VehicleRegistration;
import com.vehicleregistration.repository.VehicleRegistrationDaoMongoRepository;
import com.vehicleregistration.repository.VehicleRegistrationDaoRepository;

@Service
@Transactional
public class VehicleRegistrationService {

	VehicleRegistrationDaoMongoRepository vehicleRegistrationDaoMongoRepository;

	public VehicleRegistrationService(VehicleRegistrationDaoMongoRepository vehicleRegistrationDaoMongoRepository) {
		this.vehicleRegistrationDaoMongoRepository = vehicleRegistrationDaoMongoRepository;
	}

	public VehicleRegistration findOne(String serialNumber) {
		return vehicleRegistrationDaoMongoRepository.findBySerialNumber(serialNumber);

	}

}
