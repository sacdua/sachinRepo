package Day5;

public class Child_Method extends Parent_Method
{
public void ChildMethod()
{	
	super.ParentMethod1(67);
	System.out.println("This is child default method");	
}
public void ChildMethod1(int a)
{
	this.ChildMethod3(56,87,56);
	System.out.println("This is child one parameterized method");
}
public void ChildMethod2(int a, int b)
{
	this.ChildMethod1(65);
	System.out.println("This is child two parameterized method");
}
public void ChildMethod3(int a, int b, int c)
{
	this.ChildMethod();
	System.out.println("This is child three parameterized method");
}
public static void main(String[] args) 
{
	Child_Method obj = new Child_Method();
	obj.ChildMethod2(12, 43);
}



}
