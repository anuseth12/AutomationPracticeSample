package pckgsample;

public class Assign_19Mar1Child extends  Assign_19Mar1  {

	public void display_child()
	{
		super.display();
	  System.out.println("This is child default method");
	    this.display3_child();
		this.display1_child();
		this.display2_child();
	}
	
	public void display1_child()
	{
		System.out.println("This is child one parameterized method");
	}
	
	public void display2_child()
	{
		System.out.println("This is child two parameterized method");
	}
	
	public void display3_child()
	{
		System.out.println("This is child three parameterized method");
	}
	
	public static void main(String[] args) {
		
		Assign_19Mar1Child obj1=new Assign_19Mar1Child();
		obj1.display_child();
	}
}
