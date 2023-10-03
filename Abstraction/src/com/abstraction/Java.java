//Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises

package com.abstraction;
abstract class Person
{
	public abstract void  eat();
	public abstract void exercise();
}

class Athlete extends Person
{
	@Override
	public void eat() 
	{
		System.out.println("Atthlete Eating");
	}

	@Override
	public void exercise() 
	{
		System.out.println("Atthlete Exercise");
	}	
}
class LazyPerson extends Person
{
	@Override
	public void eat() 
	{
		System.out.println("LazyPerson Eating");
		
	}

	@Override
	public void exercise() 
	{
		System.out.println("LazyPerson Exercise");
	}
	
}
public class Java {

	public static void main(String[] args) 
	{
		Person Athlete = new Athlete();
		Person LazyPerson = new LazyPerson();
		
		Athlete.eat();
		Athlete.exercise();
		
		LazyPerson.eat();
		LazyPerson.exercise();
	}
}
