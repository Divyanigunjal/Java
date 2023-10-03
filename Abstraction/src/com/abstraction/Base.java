package com.abstraction;
public abstract class Vehicle

{
	// make, model, year, and fuel type
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private int fuelEfficiency;
	
	public Vehicle(String make,String model,int year,String fuelType, int fuelEfficiency)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.fuelType=fuelType;
		this.fuelEfficiency=fuelEfficiency;
	
	}
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getFuelType() {
		return fuelType;
	}

	//fuel efficiency, distance traveled, and maximum speed.
	abstract public int fuelEfficiency();
	
	abstract public int distanceTravelled();
	
	abstract public int maximumSpeed();
	

public	class Truck extends Vehicle

{
	@SuppressWarnings("unused")
	private int space;
	public Truck(String make,String model,int year,String fuelType ,int fuelefficiency,int space)
	{
		super(make,model,year,fuelType,fuelEfficiency);
		this.space=space;
	}
	@Override
	public int fuelEfficiency() {
		// TODO Auto-generated method stub
		return 9;
	}
	@Override
	public int distanceTravelled() {
		// TODO Auto-generated method stub
		return distanceTravelled()*fuelEfficiency();
	}
	@Override
	public int maximumSpeed() {
		// TODO Auto-generated method stub
		return 60;
	}
	
}
	
}
public class Car extends Vehicle
{
	@SuppressWarnings("unused")
	private int carseat;
	public Car(String make,String model,int year,String fuelType,int fuelEfficiency, int carseat)
	{
		super(make,model,year,fuelType,fuelEfficiency);
		this.carseat=carseat;
	}
	@Override
	public int fuelEfficiency() {
		// TODO Auto-generated method stub 
		return 3;
	}
	@Override
	public int distanceTravelled() {
		// TODO Auto-generated method stub
		 return distanceTravelled()*fuelEfficiency();
	}
	@Override
	public int maximumSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}
}

public class Motorcycle extends Vehicle

{
	@SuppressWarnings("unused")
	private int motorseat;
	public Motorcycle(String make,String model,int year,String fuelType,int fuelEfficiency, int motorseat)
	{
		super(make,model,year,fuelType,fuelEfficiency);
		this.motorseat=motorseat;
	}
	@Override
	public int fuelEfficiency() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public int distanceTravelled() {
		// TODO Auto-generated method stub
		return distanceTravelled()*fuelEfficiency();
	}
	@Override
	public int maximumSpeed() {
		// TODO Auto-generated method stub
		return 40;
	}
}






public class Base {

	public static void main(String[] args) {
		
		com.abstraction.Vehicle.Truck t=new com.abstraction.Vehicle.Truck("Truck make","Truck model",2011,"Diesel",9,18);
		
		((Vehicle) t).fuelEfficiency();
		System.out.println("Truck Details");
		
		System.out.println("fuelEfficiency="+t.fuelEfficiency());
		System.out.println("distanceTravelledy="+t.distanceTravelled());
		System.out.println("maximumSpeed="+t.maximumSpeed());
		
		
		
		 
		
		Car c=new Car("Carmake","Carmodel",2018,"CNG",6);
		Motorcycle m=new Motorcycle("Motormake","Motormodel",2020,"Petrol",2);

	}

}
