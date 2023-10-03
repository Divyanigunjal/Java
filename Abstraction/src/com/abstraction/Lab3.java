package com.abstraction;

import java.util.*;

//Q1.Write a program to find a perfect number example
public class Lab3 {

	public static void main(String[] args) {
		int n,sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the which you want:");
	
		n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==n)
		{
			System.out.println("number is perfect");
		}
		else
		{
			System.out.println("number is not perfect");
		}
		
	}

}


//Q2.Write a program which will explain Pre/Post increment and Pre/Post Decrement operator
public class Lab3 {

	public static void main(String[] args) {
		int a=20,b,c,d,e;
		b=++a;
		c=a++;
		d=a--;
		e=--a;
		System.out.println("Pre increment"+b);
		System.out.println("Pre increment"+c);
		System.out.println("Pre increment"+d);
		System.out.println("Pre increment"+e);
	}
}


/*Q3.. generate below pattern
1      
121
12321
1234321
*/
public class Lab3 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.print(j);
			}
			for(k=i-1;k>=1;k--)
			{
				
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

			
//Q4.Write a Java program that takes a number from the user and generates an integer between 1 and 12 and displays the name of the month.
/*
Test Data
Input number: 5
Expected Output :
May
*/
public class Lab3 {

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


