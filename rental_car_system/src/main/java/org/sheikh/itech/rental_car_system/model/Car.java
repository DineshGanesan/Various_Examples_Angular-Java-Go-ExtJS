package org.sheikh.itech.rental_car_system.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType
@XmlRootElement
public class Car {

	private int carId;
	private String carName;
	private String carType;
	private int carRent;
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarRent() {
		return carRent;
	}
	public void setCarRent(int carRent) {
		this.carRent = carRent;
	}
	
	
}
