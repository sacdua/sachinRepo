package Day3;

public class Learning 
{
public void method() 
{	
	System.out.println("This is default method");
	this.method1(31);
}
public void method1(int a)
{	
	System.out.println("This is one parameterized method");
	this.method2(34, 56);
}

public void method2(int a, int b)
{	
	System.out.println("This is two parameterized method");
	this.method4(98, 56, 78, 98);
}
public void method3 (int a, int b, int c) 
{	
	System.out.println("This is three parameterized method");
	this.method();
}
public void method4(int a, int b, int c, int d)
{
	System.out.println("This is four parameterized method");
}
public void method5 (int a, int b, int c, int d, int e)
{
	    this.method3(11,12,13);
		System.out.println("This is five parameterized method");		
}
public static void main(String[] args)
{
	Learning obj1 = new Learning();	
	obj1.method5(12,13,14,15,16);
}

}
