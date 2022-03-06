package Day6;

public class Overloading 
{
	public void staticpolymorphism (int a, int b, float c)
	{
		int d;
		d= a+b+(int)c;
		System.out.println("Overloading Example");
		System.out.println("Result of d is "+d);
	}
	public void staticpolymorphism (int a, int b)
	{
		int e;
		e = a*b;
		System.out.println("Result of e is "+e);
	}
	public static void main(String[] args) 
	{
		Overloading obj = new Overloading();		
		obj.staticpolymorphism(12,5,10);		
		obj.staticpolymorphism(12,34);
	}

}
