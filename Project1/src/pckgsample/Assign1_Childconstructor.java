package pckgsample;

public class Assign1_Childconstructor extends Assign1_13Mar{
	
	public Assign1_Childconstructor()
	{
	this (2,3);
	System.out.println("this is child default constructor");
}

public Assign1_Childconstructor(int a)
{
	this(4,5,6); //calling three
	System.out.println("this is child one paramterized constructor");
}

public Assign1_Childconstructor(int a, int b)
{
	this(2);  //call to 3 constructor
	System.out.println("this is child two paramterized constructor");
}

public Assign1_Childconstructor(int a,int b, int c)
{
	//this(8,9); 
	super(3);
	
	System.out.println("this is child three paramterized constructor");
}

public static void main(String[] args) {
	 
	{
		Assign1_Childconstructor obj1=new Assign1_Childconstructor(2,3); //calling one paramterized
		
	}
}

}
