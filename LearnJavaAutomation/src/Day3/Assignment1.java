package Day3;

public class Assignment1 
{
public Assignment1() 
{
	this (12,13,14);       // Calling three parameterized constructor
	System.out.println("This is default constructor");
}
public Assignment1(int a) 
{
	this (12,13,14,15);   // Calling four parameterized constructor
	System.out.println("This is one parameterized constructor");
}
public Assignment1(int a,int b) 
{
	this ();    // Calling default parameterized constructor
	System.out.println("This is two parameterized constructor");
}
public Assignment1(int a,int b,int c) 
{
	System.out.println("This is three parameterized constructor");
}
public Assignment1(int a, int b, int c, int d) 
{
	this (13,53);  // Calling two parameterized constructor
	System.out.println("This is four parameterized constructor");
}
public static void main(String[] args) 
{
	Assignment1 obj1=new Assignment1(12);  // Creating object with passing one parameterized value
}
	
}
