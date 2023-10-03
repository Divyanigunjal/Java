//Q4.Write a Java program that takes a number from the user and generates an integer between 1 and 12 and displays the name of the month.
/*
Test Data
Input number: 5
Expected Output :
May
*/
package com.abstraction;
import java.util.*;

public class Month {

	public static void main(String[] args) {
		
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from 1 to 12:");
		i=sc.nextInt();
		switch(i)
		{
		case 1:
			if(i==1)
			{
				System.out.println("January");
				break;
			}
		case 2:
			if(i==2)
			{
				System.out.println("February");
				break;
			}
		case 3:
			if(i==3)
			{
				System.out.println("March");
				break;
			}
		case 4:
			if(i==4)
			{
				System.out.println("April");
				break;
			}
		case 5:
			if(i==5)
			{
				System.out.println("May");
				break;
			}
		case 6:
			if(i==6)
			{
				System.out.println("June");
				break;
			}
		case 7:
			if(i==7)
			{
				System.out.println("July");
				break;
			}
		case 8:
			if(i==8)
			{
				System.out.println("August");
				break;
			}
		case 9:
			if(i==9)
			{
				System.out.println("september");
				break;
			}
		case 10:
			if(i==10)
			{
				System.out.println("Octomber");
				break;
			}
		case 11:
			if(i==11)
			{
				System.out.println("November");
				break;
			}
		case 12:
			if(i==12)
			{
				System.out.println("December");
				break;
			}
			default:
				System.out.println("You enter a wrong input");
				
		
	}
}
}