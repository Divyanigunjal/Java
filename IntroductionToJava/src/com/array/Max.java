package com.array;

import java.util.Scanner;

public class Max {
	

	public static void main(String[] args) {
		int n;
		int max;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an array elements:");
		for(int i = 1;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i = 1;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(+max);
	}
}