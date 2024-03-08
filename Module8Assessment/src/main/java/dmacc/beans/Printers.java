/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
public class Printers {
	@Id
	@GeneratedValue
	private int id;
	private String manufacturer;
	private String model;
	private String serialNum;
	private double price;
	/**
	 * 
	 */
	public Printers() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param manufacturer
	 * @param model
	 * @param serialNum
	 * @param price
	 */
	public Printers(String manufacturer, String model, String serialNum, double price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.serialNum = serialNum;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Printers [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", serialNum=" + serialNum
				+ ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
