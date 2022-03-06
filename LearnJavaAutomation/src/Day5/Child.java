package Day5;

public class Child extends Parent
{
public Child() 
{
	super(12);
	System.out.println("This is child default constructor");
}
public Child(int a) 
{
	this(12,45,65);
	System.out.println("This is child one paramererized constructor");
}
public Child(int a, int b) 
{
	this(15);
	System.out.println("This is child two paramererized constructor");
}
public Child(int a, int b, int c) 
{
	this();
	System.out.println("This is child three paramererized constructor");
}

public static void main(String[] args) 
{
	Child obj = new Child(12,13);
}

}
