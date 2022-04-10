package pckgsample;

public class Assign_19Mar1 {

	
	public void display()
	{
		this.display3();
		System.out.println("This is parent default method");
		this.display1();
		this.display2();
	}
	
	public void display1()
	{
		System.out.println("This is  parent one parameterized method");
	}
	
	public void display2()
	{
		System.out.println("This is  parent two parameterized method");
	}
	
	public void display3()
	{
		System.out.println("This is  parent three parameterized method");
	}
	
	public static void main(String[] args) {
		
		Assign_19Mar1 obj1=new Assign_19Mar1();
		obj1.display();
	}
	
}
