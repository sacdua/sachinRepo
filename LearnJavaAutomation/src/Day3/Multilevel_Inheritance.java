package Day3;

public class Multilevel_Inheritance extends Inheritance
{
	public void againinherit()
	{
		System.out.println("This is multilevel Inheritance");
	}
	public static void main(String[] args) 
	{
		Multilevel_Inheritance obj1 = new Multilevel_Inheritance();
		obj1.againinherit();
		obj1.Inherit();
		obj1.method1();		
	}

}
