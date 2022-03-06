package Day3;

public class Inheritance extends ClassA
{
public void Inherit ()
{
	System.out.println("This is used for inheritance the properties of Class A ");	
}
public static void main(String[] args) 
{
	Inheritance obj1 = new Inheritance ();
	obj1.Inherit();
	obj1.method1();
}

}
