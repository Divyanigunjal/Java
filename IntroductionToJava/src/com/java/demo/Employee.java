package com.java.demo;

public class Employee {
	
	private String name;
	private String jobTitle;
	private int salary;
	
	public Employee(String name,String jobTitle,int salary)
	{
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void updateSalary(int percentage)
	{
		salary=salary + salary * percentage / 100;
	}
	public void employeedetails()
	{
		System.out.println("Name:"+name);
		System.out.println("jobTitle:"+jobTitle);
		System.out.println("Salary:"+salary);
	}

	public static void main(String[] args) {
		
		Employee e=new Employee("Divyani","Software Developer",50000);
		e.employeedetails();
		e.updateSalary(10);
		
		System.out.println("\n");
		
		Employee e1=new Employee("Amita","Manager",70000);
		e1.employeedetails();
		e1.updateSalary(20);
		
		System.out.println("After updating the salary:\n");
		e.employeedetails();
		
		System.out.println("\n");
		e1.employeedetails();
		
	}

}
