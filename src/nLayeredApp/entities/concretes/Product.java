package nLayeredApp.entities.concretes;

import nLayeredApp.core.entities.Entity;

//��plak class kalmas�n
public class Product extends Entity{
	
	private int id;
	private String name;
	private double unitPrice;
	private Category category;
	
	public Product() {
		super();
	}
	
	public Product(int id, String name, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

}
