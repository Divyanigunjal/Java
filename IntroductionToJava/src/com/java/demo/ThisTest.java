/*
package com.java.demo;
*/
//1.this can be used to refer current class instance variable.
/*
public class ThisTest {
	
	int rollno;
	String name;
	
	ThisTest(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("Constructor");	
	}
	
	void thistest()
	{
		System.out.println(rollno+ " " +name);
	}
	
	public static void main(String[] args) 
	{
		ThisTest t=new ThisTest(20,"Div");
		t.thistest();
	}
}
*/


// 2.Program where this keyword is not required
/*
public class ThisTest
{
	int rollno;
	String name;
	float fees;

	ThisTest(int r,String n,float f)
	{
		rollno=r;
		name=n;
		fees=f;
	}
	public void display()
	{
		System.out.println(+rollno +" "+name +" "+ fees);
		//System.out.println("Method");	
	}
	public static void main(String[] args)
	{
		ThisTest TT=new ThisTest(22, "Divyani" ,20050);
		ThisTest TT1=new ThisTest(25, "Yash", 15000);	
		TT.display();
		TT1.display();	
	}
}
*/

// 3.this: to invoke current class method
/*
class ThisTest
{
	void set()
	{
		System.out.println("Hello set");
	}
	void get()
	{
		System.out.println("Hello get");
		this.set();
	}
	public static void main(String[] args)
	{
		ThisTest TT = new ThisTest();
		TT.get();	
	}
}
*/

// 4.this() : to invoke current class constructor
/*
class ThisTest
{
	ThisTest()
	{
		System.out.println("Construtor");
	}
	ThisTest(int a,float f)
	{
		this();
		System.out.println("Parameterized Construtor");
	}
	public static void main(String[] args)
	{
		ThisTest TT=new ThisTest(20,2.5f);
	}
}
*/

//  5.this: to pass as an argument in the method
/*
class ThisTest{  
	  void run(ThisTest obj)
	  {  
		  System.out.println("method is invoked");  
	  }  
	  void gun()
	  {  
		  run(this);  
	  }  
	  public static void main(String args[])
	  {  
		  ThisTest obj=new ThisTest();  
		  obj.gun();  
	  }  
}  
*/

//6.Proving this keyword
/*
class ThisTest
{
	void get()
	{
		System.out.println(this);
	}
	public static void main(String[] args)
	{
		ThisTest obj=new ThisTest();
		System.out.println(obj);
		obj.get();
	}
}
*/