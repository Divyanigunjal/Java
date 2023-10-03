package com.java.demo;
class Parent
{
	
	String name;
}
class Child extends Parent
{
	String name;
    public  void display()
    {
    	name="parent";
    	name="child";
    	System.out.println(name + "and "+name);
    }
    public static void main(String[] args)
    {
    	Child cobj=new Child();
    	cobj.display();
    }
}
