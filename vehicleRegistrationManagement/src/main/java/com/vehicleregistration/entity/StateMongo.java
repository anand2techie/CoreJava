package com.vehicleregistration.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StateMongo {

	@Id
	private int stateId;
	private String stateCode;
	private String stateName;

	public StateMongo() {
		// TODO Auto-generated constructor stub
	}
	
	public StateMongo(int stateId, String stateCode, String stateName) {
		this.stateId = stateId;
		this.stateCode = stateCode;
		this.stateName = stateName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


}
