package com.vehicleregistration.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="vehicle_registration")
public class VehicleRegistrationMongo {

	@Id
	private int vehicleId;
	
	private State state;
	
	private String serialNumber;
	
	private Date expiryDate;
	
	private boolean isSooner;
	
	public VehicleRegistrationMongo() {
		// TODO Auto-generated constructor stub
	}
	
	public VehicleRegistrationMongo(int vehicleId, State state, String serialNumber, Date expiryDate, boolean isSooner) {
		this.vehicleId = vehicleId;
		this.state = state;
		this.serialNumber = serialNumber;
		this.expiryDate = expiryDate;
		this.isSooner = isSooner;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean isSooner() {
		return isSooner;
	}

	public void setSooner(boolean isSooner) {
		this.isSooner = isSooner;
	}
	
	
	


	
}
