/*
package com.java.demo.intro;

 //Constructor
 /*
class Constructor{
	public Constructor()
	{
	
	}
	public Constructor(int a, int b)//parameter list
	{
	
	}
	public Constructor(int a, int b,int c)
	{
	
	}
	public Constructor(int a,float b, int c)
	{
	
	}
	public class constructor{
	public static void main(String[] args)
	{
		Constructor c=new Constructor(4,5);//argument list
	}
	}
}
	

*/

//method overloading
/*
class Addition
{
	int a, b, c,d, result;
	
	  public void add(int a, int b) //declaration of method 
	  {
		  int result=a*b;
	  System.out.println(result);
	  }
	
	
	public double add(int a,int b, double c)
	{
		double result=a*b*c;
		//System.out.println(result);
		return result;
	}
	public void add(int a)
	{
		int result=a*a;
		System.out.println(result);
	}
	
}

public class constructor {

	
	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.add(4);
		a.add(3, 6);
		a.add(3, 7, 8);

	}

}
*/


//method overriding
/*
class ABC
{
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}
}
class MNC extends ABC
{
	public void add(int a, int b)
	{
		int result=a*b;
		System.out.println(result);
	}
}
public class constructor {

	
	public static void main(String[] args) {
		
		ABC a=new MNC();   //downcasting 
		a.add(3, 9);
	}
	

}
*/
/*1) java command divides allocated memory into two parts – Stack and Heap
 *2) First, java command enters stack memory for execution. First, 
 *   it checks whether StaticDemo is loaded into heap memory or not.
 *3)If it is not loaded, loading operation of MainClass starts. 
 *Randomly some memory space is allocated to MainClass. It is called Class memory. 
 *All static members are loaded into this class memory.
 * There is only one satic member in MainClass – main() method. It is loaded into class memory of MainClass.
 * 
 * Step 2:

After loading all static members, SIB – Static initialization Blocks are executed. 
Remember, SIBs are not stored in the heap memory. 
They just come to stack, execute their tasks and leaves the memory.
 * So, after loading main() method, SIB of MainClass enters stack for execution
 * 
 * 
 */

//java has 2 memory stack and heap
/*
class StaticComponenets
{
	static int stasticVariable;
	//static block
	static 
	{
		System.out.println("Static block initlizer SBI");
		stasticVariable=10;
	}
	public static void staticMethod()
	{
		System.out.println("from static method");
		System.out.println(stasticVariable);
	}
}

public class constructor {  //step 1 //memory allocate random

	static 
	{
		System.out.println("static main SBI for main");
	}
	public static void main(String[] args) 
	{
	//	System.out.println("main ka 1st statment");
		StaticComponenets.stasticVariable=20;
		StaticComponenets.staticMethod();
		
		
		 * StaticDemo sd=new StaticDemo(); sd.dispaly(); // display();
		 * StaticDemo.dispaly();
		 
	}


}
*/
	
