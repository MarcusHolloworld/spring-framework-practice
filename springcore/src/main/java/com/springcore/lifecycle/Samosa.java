package com.springcore.lifecycle;

public class Samosa {
	private double price;
	
	public Samosa() {
		super();
	}
	
	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}
	
	public double srtPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
