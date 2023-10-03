//Q.1 Write a program to convert celsius to fahrenheit
/*
package com.java.demo;
public class Program {

	public static void main(String[] args) {
		
		float celsius=13,fahrenheit;
		fahrenheit=((celsius*9)/5)+32;
		System.out.println("The celsius to fahrenheit converion is:"+fahrenheit);
	}
}
*/

//Q.2 Write a java programs to perform basic calculators operations(Input from user using switch case)
/*
package com.java.demo;
import java.util.Scanner;

public class Program {
	public static void main(String[] args)
	{
		int n,n1,n2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		n1 = scanner.nextInt();
		
		System.out.println("Enter the 2nd number:");
		n2 = scanner.nextInt();
		
		System.out.println("Enter an operator which you to perform:");
		char operator = scanner.next().charAt(0);
		
		switch(operator)
		 {
		 case '+':
		 {
			 n=n1+n2;
			 System.out.println(n);
			 break;
		 }
		 case '-':
		 {
			 n=n1-n2; 
			 System.out.println(n);
			 break;
		 }
		 case '*':
		 {
			 n=n1*n2; 
			 System.out.println(n);
			 break;
		 }
		 case '/':
		 {
			 n=n1/n2;
			 System.out.println(n);
			 break;
		 }
		 default:
			 System.out.println("Invalid operation");
			 return;
		 }
	}
}

*/
	
//Q.3 WAP to check whether the number is palindrome or not.
/*
package com.java.demo;
public class Program {

	public static void main(String[] args) {
		
		int a=4224;
		int temp=a;
		int rem,sum=0;
		
		while(a>0)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
		
	}
}

*/
//Q.4. WAP to generate Fibonacci series : 0 1 1 2 3 5 8

/*
package com.java.demo;
public class Program {

	public static void main(String[] args) {
		
		int a=0,b=1,c,i;
		int num=10;
		for(i=1;i<=num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
*/








/*
package com.java.demo;
*/

//Finding Factorial of a number 
/*
public class Program {

	public static void main(String[] args) {
		
		int a,factorial=1;
		
		int num=10;
		for(a=1;a<=num;a++)
		{
			factorial=factorial*a;
		}
		System.out.println("The factorial of given number is:"+factorial);
	}
}

//DRY
* 1st iteration for(a=1;a<=10;a++) 
   a=1, output : fact=1
   
* 2nd iteration for(a=1;a<=10;a++)
  a=2, output : fact=1*2=2
   
* 3rd iteration for(a=3;a<=10;a++)
* a=3, output :fact=2*3=6
* 
* 4th iteration  for(a=4;a<=10;a++)
* a=4,fact=6*4=24
* 
* .....so on till a=10 after that stop 


*/

//FIBONACCI series 0 1 1 2 3 5 8 13 21 34 55
/*
public class Program {

	public static void main(String[] args) {
		
		int a,b,c=0,i;
		
		int num=10;
		for(i=0;i<=num;i++)
		{
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}
		
	}
}
*/
//DRY
/*
1st iteration  for(i=0;i<10;i++)
Output - 0
*a=b  a=1  *b=c  b=0 *c=a+b c=1

2nd iteration for(i=1;i<10;i++)
output - 0 1 
*a=b  a=0 *b=c  b=1 *c=a+b  c=1

3rd iteration for(i=2;i<10;i++)
output - 0 1 1
*a=b   a=1  *b=c   b=1  *c=a+b c=2

4th iteration for(i=3;i<10;i++)
output- 0 1 1 2
*a=b a=1 *b=c b=2 *c=a+b  c=3

5th iteration for(i=4;i<10;i++)
output - 0 1 1 2 3
*a=b a=2  *b=c  b=3  *c=a+b c=5
*/




//PRINT EVEN NUMBER BETN 1 TO 100
/*
public class Program {

	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}	
		}
	}
}
*/
//DRY

/*
*1st iteration for(i=1;i<=100;i++)
if(i%2==0) i value is 1	i.e if(1%2==0) condition not satisfied so it will not print anything

*2nd iteration for(i=2;i<=100;i++)
if(i%2==0) i value is 2	i.e if(2%2==0) condition  satisfied so it will print that number

*it will check till the 100 
*/


//sum of first 10 natural number
/*
public class Program {

	public static void main(String[] args) {
		
		int a=1,sum=0,num=10;
		
		for(a=1;a<=num;a++)
		{
			sum=a+sum;
		}
		System.out.println("The sum of first 10 natural number is:"+sum);
	}
}


//DRY
1st iteration  for(a=1;a<=10;a++) 
sum=a+sum   sum=1+0=1

2nd iteration  for(a=2;a<=10;a++)
sum=a+sum    sum=2+1=3

3rd iteration  for(a=3;a<=10;a++)
sum=a+sum      sum=3+2=5

4th iteration  for(a=3;a<=10;a++)
sum=a+sum      sum=5+3=8

and so on...

*/

//sum of digit 
/*
public class Program {

	public static void main(String[] args) {
		
		int lastdigit,sum=0;
		int num=841;
		

		while(num>=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}
		System.out.println("The sum of digit is:"+sum);
	}
}
*/

//DRY
/*
*1st iteration :
while(num>=0) i.e 841>0 then 
lastdigit=num%10; i.e 841%10 = 1 so, lastdigit=1
sum=sum+lastdigit; i.e 0+1=1 so, sum=1
num=num/10; i.e 841/10=84

2nd iteration : 
while(num>=0) i.e 84>0 then
lastdigit=num%10; i.e 84%10 = 4 so, lastdigit=4
sum=sum+lastdigit; i.e 1+4=5 so, sum=5
num=num/10; i.e 84/10=8

3rd iteration :
while(num>=0) i.e 8>0 then
lastdigit=num%10; i.e 8%10 = 8 so, lastdigit=8
sum=sum+lastdigit; i.e 5+8=13 so, sum=13
num=num/10; i.e 8/10=0.8

4th iteration condition false , stop

*
*

//palindrome or not
/*
public class Program {

	public static void main(String[] args) {
		
		int a=121;
		int temp=a;
		int num,rem,sum=0;
		
		while(a>0)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
		
	}
}
/*
1st iteration while(121>0) then 
rem=a%10  rem=121%10  So,rem=1
sum=sum*10+rem  sum=1
a=a/10  a=121/10  a=12

2nd iteration while(12>0)
rem=a%10  rem=12%10  So,rem=2
sum=sum*10+rem  sum=12
a=a/10  a=12/10  a=1

3rd iteration while(1>0)
rem=a%10  rem=1%10  So,rem=1
sum=sum*10+rem  sum=121
a=a/10  a=1/10  a=0

While Loop end & Check condition
compare temp==sum i.e 121==121
s0 it will print number is palindrome
*/

