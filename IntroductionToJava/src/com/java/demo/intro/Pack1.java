package com.java.demo.intro;


class A
{
    protected static String s = "A";
}
 
class B extends A
{
     
}
 
class C extends B
{   
    static void methodOfC()
    {
        System.out.println(s);
    }
}
 
public class Pack1
{
    public static void main(String[] args)
    {
        C.methodOfC();
    }
}