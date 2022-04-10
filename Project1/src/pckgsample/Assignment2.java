package pckgsample;

public class Assignment2 {
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
public int sub(int c, int d)
{
   int e=c-d;
   return e;
}

public int mult(int e,int f)
{
	int g=e*f;
	return g;
	}

public void div(int h,int i)
{
	int j=h/i;
	System.out.println("Final Result is :"+ j);
	}

public static void main(String[] args) {

	Assignment2 ass=new Assignment2();
	System.out.println("Result of (((((10+2)+2)-2)*2)/2)");
	int sumtotal1=ass.sum(10, 2);
	System.out.println("Sum is "+ sumtotal1);
	int sumtotal2=ass.sum(sumtotal1, 2);
	System.out.println("Sum final is "+ sumtotal2);
	int subtotal= ass.sub(sumtotal2, 2);
	System.out.println("Sub final is"+ subtotal);
	int mult=ass.mult(subtotal, 2);
	System.out.println("Multipcation result is "+ mult);
	ass.div(mult, 2);
	
	
}

}
