/*Q3.. generate below pattern
1      
121
12321
1234321
*/


package com.abstraction;

public class Pattern {

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