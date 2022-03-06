package Assignment1;

public class Student {
	int age;
	int roll_no;

	public void display1() {
		System.out.println("Welcome to all of you");
	}

	public void display2() {
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.age = 28;
		obj.roll_no = 123;
		System.out.println("Age is " + obj.age);
		System.out.println("Roll no is " + obj.roll_no);
		obj.display1();
		obj.display2();
	}
//test comment2
}
