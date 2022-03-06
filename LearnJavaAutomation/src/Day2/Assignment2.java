package Day2;

public class Assignment2 
{
	public int mulultiply (int a, int b)   // Parameterized non void method
	{
	  int c;   //Local Variable
	  c=a*b;
	  System.out.println("Result of Multiplication is : " +c);
	  return c;
	}
	public int subtraction (int x, int y)   // Parameterized non void method
	{
		int z;  // Local Variable
		z=x-y;
		System.out.println("Result of subtraction is : " +z);
		return z;
	}
	public int sum (int a1, int b1)   // Parameterized non void method
	{
		int c1;  // Local Variable
		c1=a1+b1;
		System.out.println("Result of sum is : " +c1);
		return c1;
	}
	public void division(int x1, int y1)// Parameterized void method
	{
		int z1; //Local Variable
		z1=x1/y1;
		System.out.println("Result of division is : " +z1);	
	}
	
	public static void main(String[] args) 
	{
		Assignment2 result =new Assignment2();  // Creating New Object
		int MulResult1=result.mulultiply(10, 2);  // Calling Multiplication Method
		int SubtractionResult= result.subtraction(MulResult1, 2);  // Calling Subtraction Method
		int Multresult2=result.mulultiply(SubtractionResult, 2);// Calling Multiplication Method
		int SumResult=result.sum(Multresult2, 2); // Calling Sum Method
	    result.division(SumResult, 2);// Calling Division Method
		
		
		
	}
	
	
	

}
