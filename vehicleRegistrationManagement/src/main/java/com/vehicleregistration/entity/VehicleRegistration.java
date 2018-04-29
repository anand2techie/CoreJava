package com.vehicleregistration.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vx_vehicle_registration")
public class VehicleRegistration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vehicle_id")
	private int vehicleId;
	
	@ManyToOne(targetEntity=State.class)
	private State state;
	
	@Column(name="serial_number")
	private String serialNumber;
	
	@Column(name="expiry_date")
	private Date expiryDate;
	
	@Column(name="is_sooner")
	private boolean isSooner;
	
	public VehicleRegistration() {
		// TODO Auto-generated constructor stub
	}
	
	public VehicleRegistration(int vehicleId, State state, String serialNumber, Date expiryDate, boolean isSooner) {
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
