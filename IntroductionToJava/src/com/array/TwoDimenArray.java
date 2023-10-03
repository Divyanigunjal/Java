package com.array;

//import java.util.Scanner;
/*
public class TwoDimenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		
		int[][] numbers=new int[rows][columns];
		
		
		//INPUT
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				numbers[i][j]=sc.nextInt();
			}
			
		}
		
		//OUTPUT
		for(int i=0;i<columns;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println(numbers[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
*/
//matrix multiplication
public class TwoDimenArray{  
	public static void main(String args[])
	{  
		int a1[][]={{1,2,3},{4,5,9},{8,7,4}};    
		int a2[][]={{5,5,7},{4,6,3},{7,5,6}}; 
		int a3[][]=new int[3][3];
		int sum=0;
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		for(int k=0;k<3;k++)
        	
        		{
        			sum=sum+a1[i][k]*a2[k][j];
        		}
        		a3[i][j]=sum;
        		sum=0;
        	}
        }
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.println(a3[i][j]+ " ");
        	}
        	System.out.println();
        }
	
}
*/

//even and odd
/*
public static class TwodimenArray{  
	public static void main(String[] args)
	{  
		int x[]={44,57,63,12};
		
		System.out.println("Even :");  
		for(int i=0;i<x.length;i++)
		{  
			if(x[i]%2==0)
			{  
				System.out.println(x[i]);  
			}  
		}  	
		System.out.println("Odd:");  
		for(int i=0;i<x.length;i++)
		{  
			if(x[i]%2!=0)
			{  
				System.out.println(x[i]);  
			}  
		}  
	}	
}
*/

/*
class Student
{
@SuppressWarnings("resource")
public static void main(String args[])
{
    int english,maths,geography,history,hindi; 
    double total, percentage,average;
    Scanner sc=new Scanner(System.in);
    
  
    System.out.print("Enter marks of English subjects:");
    english=sc.nextInt();
    System.out.print("Enter marks of physics subjects:");
    maths=sc.nextInt();
    System.out.print("Enter marks of chemistry subjects:");
    geography=sc.nextInt();
    System.out.print("Enter marks of maths subjects:");
    history=sc.nextInt();
    System.out.print("Enter marks of computers subjects:");
    hindi=sc.nextInt();

    
    total = english+maths+geography+history+hindi;
    average=(total/5);
    System.out.println("Total marks you got="+total +"out off 500");
    
    System.out.println("average ="+average);
    percentage = (total / 500)*100;  
    System.out.println("Percentage ="+percentage);

   }
}
*/