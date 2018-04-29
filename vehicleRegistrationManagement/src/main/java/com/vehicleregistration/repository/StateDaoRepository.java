package com.vehicleregistration.repository;

import org.springframework.data.repository.CrudRepository;

import com.vehicleregistration.entity.State;

public interface StateDaoRepository extends CrudRepository<State, Integer>{

}
