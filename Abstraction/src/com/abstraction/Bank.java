//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.

package com.abstraction;
abstract class BankAccount
{
	
	//@SuppressWarnings("unused")
	protected int accountNumber;
	//@SuppressWarnings("unused")
	protected double accountbalance;
	
	
	public BankAccount(int accountNumber,double accountbalance) {
		this.accountNumber=accountNumber;
		this.accountbalance=accountbalance;
		
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
		
	}
	
	public double getAccountBalance()
	{
		return accountNumber;
		
	}
	
	public void setAccountBalance(double accountbalance)
	{
		this.accountbalance=accountbalance;
		
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}

class SavingAccount extends BankAccount 
{

	public SavingAccount(int accountNumber, double accountbalance) {
		super(accountNumber, accountbalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {

		accountbalance=accountbalance+amount;
		System.out.println(amount+ " is Deposited in account "+accountNumber);
		
	}

	@Override
	public void withdraw(double withdrawamount) {
		
		if(accountbalance>withdrawamount)
		{
			accountbalance=accountbalance-withdrawamount;
			System.out.println("The balance after withdrawing is:"+accountbalance);
			
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
	}
	
}

class CurrentAccount extends BankAccount
{

	public CurrentAccount(int accountNumber, double accountbalance) {
		super(accountNumber, accountbalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {

		accountbalance=accountbalance+amount;
		System.out.println(amount+ " is Deposited in account "+accountNumber);
		
	}


	@Override
	public void withdraw(double withdrawamount) {
		
		if(accountbalance>withdrawamount)
		{
			accountbalance=accountbalance-withdrawamount;
			System.out.println("The balance after withdrawing is:"+accountbalance);
			
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
	}
	
}
public class Bank {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(5000,3521.50);
		SavingAccount account2 = new SavingAccount(3333, 500);
		CurrentAccount account3= new CurrentAccount(2510,321.0);
		 
		account1.deposit(200);
	    account1.withdraw(1500);

	    account2.withdraw(300);
	    account2.withdraw(1000);
	    
	    account3.withdraw(500);
	    account3.withdraw(3000);
	}

}
