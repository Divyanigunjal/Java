//Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.

package com.abstraction;


abstract class Bird
{
	abstract void fly();
	abstract void makeSound();
}

class Eagle extends Bird
{

	@Override
	public void fly() 
	{
		System.out.println("Eagle Fly");
	}

	@Override
	public void makeSound() 
	{
		System.out.println("Eagle makeSound");
		
	}
	
}

class Hawk extends Bird
{

	@Override
	public void fly() 
	{
		System.out.println("Hawk Fly");
	}

	@Override
	public void makeSound() 
	{
		System.out.println("Hawk makeSound");
		
	}
	
}
public class BirdClass {

	public static void main(String[] args) {
		
		Bird Eagle = new Eagle();
		Bird Hawk = new Hawk();
		
		Eagle.fly();
		Eagle.fly();
		
		Hawk.makeSound();
		Hawk.makeSound();	
		
	}

}
