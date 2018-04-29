package com.vehicleregistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vx_state")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stateId;
	@Column(name = "state_code")
	private String stateCode;
	@Column(name = "state_name")
	private String stateName;

	public State() {
		// TODO Auto-generated constructor stub
	}
	
	public State(int stateId, String stateCode, String stateName) {
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
