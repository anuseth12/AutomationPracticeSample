package pckgsample;

import java.util.Scanner;

public class Mar26_ScannerClass1 {
	
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

	Mar26_ScannerClass1 ass=new Mar26_ScannerClass1();
	System.out.println("Result of (((((x1+x2)-x3)+x4)*x5)/x6)");
			
	System.out.println("Enter values for calling sum function");
	System.out.println("Enter values of x");
	Scanner s=new Scanner(System.in);
	int x= s.nextInt();
	System.out.println("Enter values of y");
	int y=s.nextInt();
	int sumtotal1=ass.sum(x, y);
	System.out.println("Sum is "+ sumtotal1);
	
	System.out.println("Enter values for calling sub function");
	System.out.println("Enter values of x3");
	int x3= s.nextInt();
	int sub=ass.sub(sumtotal1, x3);
	System.out.println("Sub is "+ sub);
	
	System.out.println("Enter values for calling sum function again");
	System.out.println("Enter values of x4");
	int x4=s.nextInt();
	int sumtotal2=ass.sum(sub, x4);
	System.out.println("Overall sum is "+ sumtotal2);
	
	System.out.println("Enter values for calling mult function");
	System.out.println("Enter values of x5");
	int x5=s.nextInt();
	int mult=ass.mult(sumtotal2, x5);
	System.out.println("Multiplication result is "+ mult);
	
	System.out.println("Enter values for calling div function");
	System.out.println("Enter values of x6");
	int x6=s.nextInt();
	ass.div(mult, x6);
	
	
	
	
	
	
	
	
	
}

}
