package Day7;

import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the value x1");
		System.out.println("Enter the value x2");
		Scanner obj = new Scanner (System.in);
		int x1 = obj.nextInt();
		int x2 = obj.nextInt();
		int SumResult3 = x1 + x2;
		System.out.println("Sum result is :" +SumResult3);
		System.out.println("Enter the value x3");
		int x3 = obj.nextInt();
		int SubtractionResult1 = SumResult3-x3;
		System.out.println("Subtraction Result is :" +SubtractionResult1);
		System.out.println("Enter the value x4");
		int x4 = obj.nextInt();
		int SumResult4 = SubtractionResult1 + x4;
		System.out.println("2nd Sum Result is :" +SumResult4);
		System.out.println("Enter the value x5");
		int x5 = obj.nextInt();
		int MultiplyResult1 = SumResult4*x5;
		System.out.println("multiply Result is : " +MultiplyResult1);
		System.out.println("Enter the value of x6");
		int x6 = obj.nextInt();
		int DivisionResult = MultiplyResult1/x6;
		System.out.println("Division Result is : "+DivisionResult);
	
				
		
	}

}
