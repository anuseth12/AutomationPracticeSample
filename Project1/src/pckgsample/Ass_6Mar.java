package pckgsample;

public class Ass_6Mar {
	
	public Ass_6Mar()
		{
		this(1,2,3,4);
		System.out.println("this is default constructor");
	}

	public Ass_6Mar(int a)
	{
		this(4,5,6); //calling three
		System.out.println("this is one paramterized constructor");
	}
	
	public Ass_6Mar(int a, int b)
	{
		this();  //call to default constructor
		System.out.println("this is two paramterized constructor");
	}
	
	public Ass_6Mar(int a,int b, int c)
	{
		this(8,9); 
		System.out.println("this is three paramterized constructor");
	}
	
	public Ass_6Mar(int a,int b, int c, int d)
	{
		System.out.println("this is four paramterized constructor");
	}


public static void main(String[] args) {
	 
	{
		Ass_6Mar obj1=new Ass_6Mar(2); //calling one paramterized
		
	}
}
}
