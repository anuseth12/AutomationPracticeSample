package pckgsample;

import java.util.Scanner;

public class Mar26_ScannerClass2 {
	
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

	Mar26_ScannerClass2 ass=new Mar26_ScannerClass2();
	System.out.println("Result of (((((x1-x2)+x3)-x4)*x5)/x6)");
			
	System.out.println("Enter values for calling sub function");
	System.out.println("Enter values of x1");
	Scanner s=new Scanner(System.in);
	int x1= s.nextInt();
	System.out.println("Enter values of x2");
	int x2=s.nextInt();
	int subtotal1=ass.sub(x1, x2);
	System.out.println("Sub result is "+ subtotal1);
	
	System.out.println("Enter values for calling sum function");
	System.out.println("Enter values of x3");
	int x3= s.nextInt();
	int sum=ass.sum(subtotal1, x3);
	System.out.println("Sub is "+ sum);
	
	System.out.println("Enter values for calling sub function again");
	System.out.println("Enter values of x4");
	int x4=s.nextInt();
	int subtotal2=ass.sub(sum, x4);
	System.out.println("Overall sum is "+ subtotal2);
	
	System.out.println("Enter values for calling mult function");
	System.out.println("Enter values of x5");
	int x5=s.nextInt();
	int mult=ass.mult(subtotal2, x5);
	System.out.println("Multiplication result is "+ mult);
	
	System.out.println("Enter values for calling div function");
	System.out.println("Enter values of x6");
	int x6=s.nextInt();
	ass.div(mult, x6);
	
	
	
	
	
	
	
	
	
}

}
