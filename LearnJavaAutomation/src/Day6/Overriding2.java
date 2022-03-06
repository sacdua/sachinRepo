package Day6;

public class Overriding2 extends Overriding1
{
	public void dynamicpolimorphism (int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Overriding Example");
		System.out.println("Result of c is "+c);		
	}
	public static void main(String[] args) 
	{
		Overriding2 obj = new Overriding2();
		obj.dynamicpolimorphism(20, 10);   // overriding the parent class method
		
	}	
	

}
