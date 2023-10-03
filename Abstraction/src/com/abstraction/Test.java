package com.abstraction;

/*Q.1 Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark. */

/*
class Animal
{
	public void makeSound()
	{
		System.out.println("Animal Sound");
	}
}
class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat Sound");
	}
}
public class Test
{
	 public static void main(String[] args) 
	 {
		Animal a=new Animal();
		a.makeSound();
		Cat c= new Cat();
		c.makeSound();
	 }
}
*/

/*Q.2 Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/
/*
class Employee
{
	int salary;
	
	public Employee(int salary)
	{
		this.salary=salary;
	}
	public void work()
	{
		System.out.println("Employee Working");
	}
	
	public int getsalary()
	{
		return salary;
	}
}

class HRmanager extends Employee
{
	
	public HRmanager(int salary) {
		super(salary);
	}

	public void work()
	{
		System.out.println("HR Working");
	}
	
	public void addEmployee()
	{
		System.out.println("Add Employee");
	}
}
public class Test
{
	public static void main(String[] args)
	{
		Employee em=new Employee(30000);
		em.work();
		
		System.out.println("Employee Salary is:"+em.getsalary());
		
		
		HRmanager hr=new HRmanager(50000);
		hr.work();
		System.out.println("Salary of HRmanager is:"+hr.getsalary());
		hr.addEmployee();
	}
}
*/

/*
	private static String getbalance() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String withdraw() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String deposit() {
		// TODO Auto-generated method stub
		return null;
	}
}
*/

//Q3.
/*
class BankAccount{
	private int accountNumber;
	private double balance;
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public BankAccount(int accountNumber, double balance) 
	{
		//super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double depositAmount) {
		
		balance=balance+depositAmount;
		System.out.println(depositAmount+ " is Deposited"+accountNumber);
		
	}
	
	public void withDraw(double withDrawAmount) {
		if(balance>withDrawAmount) {
			balance=balance-withDrawAmount;
			System.out.println(withDrawAmount+" is Withdrwal from Account ");
			
		}else {
            System.out.println("Insufficient balance. Cannot withdraw " + withDrawAmount + " from account " + accountNumber);

		}
		
	}
}

class SavingAccount extends BankAccount{

	public SavingAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void withDraw(double withDrawAmount) 
	{
	if (getBalance() >= withDrawAmount && getBalance() - withDrawAmount >= 100) 
	{
		super.withDraw(withDrawAmount);
	} 
	else 
	{
		System.out.println("Withdrawal failed. Minimum balance of 100 must be maintained.");
	}
}

}

public class Test 
{

	public static void main(String[] args) 
	{
		 BankAccount b = new BankAccount(8445, 50000);
		 SavingAccount s = new SavingAccount(4765, 1500);
		 
		 b.deposit(500);
	     b.withDraw(100);

	     s.withDraw(200);
	     s.withDraw(100);

	}
}
*/

//Q4.

//write a java program to create a vehicle class hierarchy. the base class should be vehicle, with subclasses truck, car and motorcycle. each subclass should have properties such as make, model, year, and fuel type. implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
/*
abstract class Vehicle 
{
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private double fuelEfficiency;

	public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) 
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
		this.fuelEfficiency = fuelEfficiency;
    }
	
	public String getMake() 
	{
		return make;
	}

	public String getModel() 
	{
   return model;
}

	public int getYear() 
	{

		return year;
	}

	public String getFuelType() 
	{
		return fuelType;
	}

	public double getFuelEfficiency() 
	{
		return fuelEfficiency;
	}

	public abstract double calculateFuelEfficiency();

	public abstract double calculateDistanceTraveled();

	public abstract double getMaxSpeed();
}

class Truck extends Vehicle{
	private double cargoCapacity;

	

	public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.cargoCapacity = cargoCapacity;
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
	}

	@Override
	public double calculateDistanceTraveled() {
		// TODO Auto-generated method stub
		return calculateFuelEfficiency() * getFuelEfficiency();
	}

	@Override
	public double getMaxSpeed() {
		// TODO Auto-generated method stub
		return 100.0;
	}
	public void truckInfo() {
		System.out.println("Truck Model: " +getModel());
		System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " mpg");
		System.out.println("Distance Traveled: " + calculateDistanceTraveled() + " miles");
		System.out.println("Max Speed: " +getMaxSpeed() + " mph\n");
	}
	
	
	
}
class Car extends Vehicle{
	

	private int numSeats;

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.numSeats = numSeats;
	}
	
	

	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		
		return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
	}

	@Override
	public double calculateDistanceTraveled() {
		// TODO Auto-generated method stub
		return calculateFuelEfficiency() * getFuelEfficiency();
	}

	@Override
	public double getMaxSpeed() {
		// TODO Auto-generated method stub
		return 140.0;
	}
	
	public void carInfo() {
		System.out.println("Car Model: " +getModel());
		System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " mpg");
		System.out.println("Distance Traveled: " + calculateDistanceTraveled() + " miles");
		System.out.println("Max Speed: " +getMaxSpeed() + " mph\n");
	}
	
	
}

class Motorcycle extends Vehicle{
  private double engineDisplacement;

	public double getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(double engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}

	public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency
			) {
		super(make, model, year, fuelType, fuelEfficiency);
		
	}

	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
	}

	@Override
	public double calculateDistanceTraveled() {
		// TODO Auto-generated method stub
		return calculateFuelEfficiency() * getFuelEfficiency();
	}

	@Override
	public double getMaxSpeed() {
		// TODO Auto-generated method stub
		return 160.0;
	}
	
	public void motorcycleInfo() {
		System.out.println("Motorcycle Model: " +getModel());
		System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " mpg");
		System.out.println("Distance Traveled: " + calculateDistanceTraveled() + " miles");
		System.out.println("Max Speed: " +getMaxSpeed() + " mph\n");
	}

	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
		Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
		Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Warrior200", 2018, "GASOLINE", 2.1);

		truck.truckInfo();
		car.carInfo();
		motorcycle.motorcycleInfo();
	}

}
*/
