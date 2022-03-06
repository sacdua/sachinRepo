package Day5;

public class Parent_Method  
{
	public void ParentMethod()
	{
		this.ParentMethod3(45,56,76);
		System.out.println("This is Parent default method");
	}
	public void ParentMethod1(int a)
	{
		this.ParentMethod2(78,89);
		System.out.println("This is Parent one parameterized method");
	}
	public void ParentMethod2(int a,int b)
	{
		this.ParentMethod();
		System.out.println("This is Parent two parameterized method");
	}
	public void ParentMethod3(int a,int b,int c)
	{
		System.out.println("This is Parent three parameterized method");
	}
	
	
	
}
