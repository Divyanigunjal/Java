//Q1.Write a program to find a perfect number example
package com.abstraction;

import java.util.*;

public class Perfect {

	public static void main(String[] args) {
		int n,sum=0;
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
