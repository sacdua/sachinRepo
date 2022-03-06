package Day5;

public class Parent
{
public Parent() 
{
	this(45,87,76);
	System.out.println("This is Parent default constructor");
}
public Parent(int a) 
{
	this(12,65);
	System.out.println("This is Parent one parameterized constructor");
}
public Parent(int a, int b) 
{
	this();
	System.out.println("This is Parent two parameterized constructor");
}
public Parent(int a, int b, int c) 
{
	System.out.println("This is Parent three parameterized constructor");
}



}
