package com.array;

class A
{
	int a;
	static int b;
	
	static void b()
	{
		System.out.println(b);
	}
	
	void a()
	{
		System.out.println(b);
		System.out.println(a);
	}
}

public class Static {

	public static void main(String[] args) {
		A.b=10;
		//A.a=10;
		A a1=new A();
		A a2=new A();
		System.out.println(a1.b);
		System.out.println(a1.a);
		
		a1.a();
		//a1.b();
		
		System.out.println(a2.b);
		//a1.b=20;
		System.out.println(a2.b);
	}

}
