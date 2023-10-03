//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

package com.abstraction;


abstract class Vehiicle
{
	
	public abstract void startEngine();
	public abstract void stopEngine();
}


class Car1 extends Vehiicle
{

	public void startEngine() {
		System.out.println("Car Engine Start");
	}

	public void stopEngine() {
		System.out.println("Car Engine Stop");
		
	}
	
}
class Motorcycle1 extends Vehiicle
{

	@Override
	public void startEngine() {
		System.out.println("Motorcycle Engine Start");
	}

	@Override
	public void stopEngine() {
		System.out.println("Motorcycle Engine Stop");
		
	}
	
}


public class Lab {

	public static void main(String[] args) {
		Vehiicle Car1= new Car1();
		Vehiicle Motorcycle1= new Motorcycle1();
		Car1.startEngine();
		Car1.stopEngine();
		
		Motorcycle1.startEngine();
		Motorcycle1.stopEngine();
		
		
		
	}

}
