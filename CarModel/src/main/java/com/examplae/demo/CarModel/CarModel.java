package com.examplae.demo.CarModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CAR")
public class CarModel {

	@Id
	private int customerid;
	private String customername;
	private String customermobilenum;
	private String customercity;
	private String carmodel;
	private String carcolour;
	private String carprice;
	private String milage;
	private String platenum;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomermobilenum() {
		return customermobilenum;
	}
	public void setCustomermobilenum(String customermobilenum) {
		this.customermobilenum = customermobilenum;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarcolour() {
		return carcolour;
	}
	public void setCarcolour(String carcolour) {
		this.carcolour = carcolour;
	}
	public String getCarprice() {
		return carprice;
	}
	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
	}
	public String getPlatenum() {
		return platenum;
	}
	public void setPlatenum(String platenum) {
		this.platenum = platenum;
	}
	
}
