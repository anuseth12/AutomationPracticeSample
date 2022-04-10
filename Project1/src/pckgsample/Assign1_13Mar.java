package pckgsample;

public class Assign1_13Mar {
	
	
	public Assign1_13Mar()
	{
	
	System.out.println("this is parent default constructor");
}

public Assign1_13Mar(int a)
{
	this(4,5,6); //calling three
	System.out.println("this is parent one paramterized constructor");
}

public Assign1_13Mar(int a, int b)
{
	this();  //call to default constructor
	System.out.println("this is parent two paramterized constructor");
}

public Assign1_13Mar(int a,int b, int c)
{
	this(8,9); 
	System.out.println("this is parent three paramterized constructor");
}

public static void main(String[] args) {
	 
	{
		Assign1_13Mar obj1=new Assign1_13Mar(2); //calling one paramterized
		
	}
}
}
