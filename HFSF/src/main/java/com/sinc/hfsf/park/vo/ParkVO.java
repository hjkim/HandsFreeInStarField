package com.sinc.hfsf.park.vo;

public class ParkVO {
	
	private String carId;
	private String carFloor;
	private String carLoc;
	
	public ParkVO(String carId, String carFloor, String carLoc) {
		super();
		this.carId = carId;
		this.carFloor = carFloor;
		this.carLoc = carLoc;
	}
	public ParkVO() {
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarFloor() {
		return carFloor;
	}
	public void setCarFloor(String carFloor) {
		this.carFloor = carFloor;
	}
	public String getCarLoc() {
		return carLoc;
	}
	public void setCarLoc(String carLoc) {
		this.carLoc = carLoc;
	}
	
	

}
