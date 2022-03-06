package Day2;

public class Assignment1 
{
public int sum (int a, int b)  // Parameterized non void method
{
	int c;   // local variable
	c=a+b;
	System.out.println("Result of sum is " +c);
	return c;
}
public int mul (int a1, int b1) // Parameterized non void method
{
	int d;   //Local Variable
	d=a1*b1;
	System.out.println("Result of Multiplication is " +d);
	return d;
}
public int sub (int x, int y) // Parameterized non void method
{
	int e;   //Local Variable
	e=x-y;
	System.out.println("Result of Subtraction is " +e);
    return e;
}
public void div (int x1, int y1) // Parameterized void method
{
	int f;   //Local Variable
	f=x1/y1;
	System.out.println("Result of Division is " +f);	
}
public static void main(String[] args) 
{
	Assignment1 answer = new Assignment1();   // New Object Created
	int SumResult1= answer.sum(10, 2);    // Calling Sum Method
	int SumResult2=answer.sum(SumResult1, 2);   // Calling Sum method again
	int SubResult=answer.sub(SumResult2, 2);   // Calling Subtraction Method
	int MulResult=answer.mul(SubResult, 2);   // Calling Multiplication Method
	answer.div(MulResult, 2);	// Calling Division Method
}
}
