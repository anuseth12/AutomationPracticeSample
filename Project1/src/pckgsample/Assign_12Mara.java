package pckgsample;

public class Assign_12Mara {

	public void display()
	{
		this.display3();
		System.out.println("This is default method");
		this.display1();
		this.display4();
		this.display2();
	}
	
	public void display1()
	{
		System.out.println("This is one parameterized method");
	}
	
	public void display2()
	{
		System.out.println("This is two parameterized method");
	}
	
	public void display3()
	{
		System.out.println("This is three parameterized method");
	}
	
	public void display4()
	{
		System.out.println("This is four parameterized method");
	}
	
	public static void main(String[] args) {
		Assign_12Mara obj1=new Assign_12Mara();
		obj1.display();
	}
}
