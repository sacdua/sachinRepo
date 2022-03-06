package Day3;

public class hierarchical_Inheritance extends ClassA
{
public void hierarchical_method() 
{
	System.out.println("This is hierarchical_Inheritance method ");
}
public static void main(String[] args)
{
	hierarchical_Inheritance obj1 = new hierarchical_Inheritance();
	obj1.method1();
	obj1.hierarchical_method();

}

}
	

