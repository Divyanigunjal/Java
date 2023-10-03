package com.abstraction;

public class Circle implements Shape1 {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		
		return Math.PI * radius * radius;
	}

}