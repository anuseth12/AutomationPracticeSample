package pckgsample;

public class Assignment3 {
	
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

public void mult(int e,int f)
{
	int g=e*f;
	System.out.println("Final Result is :"+ g);
	//return g;
	}

public int div(int h,int i)
{
	int j=h/i;
	return j;
	//System.out.println("Final Result is :"+ j);
	}

public static void main(String[] args) {
	{
		System.out.println("Result of (((((10/2)-2)+2)-2)*2)");
		Assignment3 bod= new Assignment3();
		int div1= bod.div(10, 2);
		System.out.println("Result of divison is "+ div1);
		int sub=bod.sub(div1, 2);
		System.out.println("Result of subtraction is "+ sub);
		int sum=bod.sum(sub, 2);
		System.out.println("Result of sum is "+sum);
		int sub2= bod.sub(sum, 2);
		System.out.println("Result of subtraction2 is "+sub2);
		bod.mult(sub2, 2);
		
	}
	
}

}
