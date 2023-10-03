package com.abstraction;


/*
Q.3 Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
*/
/*
class BankAccount
{
	int totalbalance;
	
	public BankAccount(int amount)
	{
		this.totalbalance=amount;
	}
	public int deposit(int amount)
	{   
		totalbalance=totalbalance+amount;
		return totalbalance;
	}
	
	public void withdraw(int amount)
	{
		if(totalbalance>=amount)
		{
			System.out.println("You can withdraw money");
		}
		else
		{
			System.out.println("You cannot withdraw money");
		}
		//return amount;
	}
	@SuppressWarnings("unused")
	private int getbalance() 
	{
		return totalbalance;
	}
	
}
class SavingAccount extends BankAccount
{
	public SavingAccount(int amount) {
		super(amount);
		
	}

	public void withdraw(int amount)
	{
		if (amount>100) 
		{
			super.withdraw(amount);
			
	    } 
		else
		{
			System.out.println("In your account 100 rupees is must");
		}
		//return amount;
	}
	
}

public class Task
{
	public static void main(String[] args)
	{
		BankAccount ba=new BankAccount(5000);
		//BankAccount amount;
		System.out.println("The amount which you have added now:"+getbalance());
		ba.deposit(1220);
		
		SavingAccount sa=new SavingAccount(5000);
		System.out.println("The amount which you withdraw now:"+getbalance());
		sa.withdraw(4000);
	}
}
*/

/*
Q.4 Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
*/
/*
public class vehicle
{
	// make, model, year, and fuel type
	private String make;
	private String model;
	private int year;
	private int fuelType;
	
	//fuel efficiency, distance traveled, and maximum speed.
	public int fuelEfficiency()
	{
		
	}
	public int distanceTravelled()
	{
		
	}
	public int maximumSpeed()
	{
		
	}
	

	
	
	public void efficiency()
	{
		
	}
	public void distance()
	{
		
	}
	public void maximumspeed()
	{
		
	}
	
}
class Truck
{

	public Truck(String string, String string2, int i, String string3, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	
}
class car
{
	
}
class Motorcycle
{
	
}

*/