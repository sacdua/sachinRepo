package Day6;

public class DataTypeConversion  
{
	public void DataTypeConversion() 
	{
		int a=40;
		float b= 10.5F;
		int c= (int)(a+b);
		System.out.println("Result of c is "+c);
		int x=45;
		char y= 'R';
		x=(int)y;
		System.out.println("value of x is "+x);
	}

public static void main(String[] args)
{
	DataTypeConversion obj =new DataTypeConversion();
	obj.DataTypeConversion();
}

}
