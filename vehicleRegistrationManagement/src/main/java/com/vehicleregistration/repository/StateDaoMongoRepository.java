package com.vehicleregistration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.vehicleregistration.entity.State;
import com.vehicleregistration.entity.StateMongo;

public interface StateDaoMongoRepository extends MongoRepository<StateMongo, Integer>{

}
