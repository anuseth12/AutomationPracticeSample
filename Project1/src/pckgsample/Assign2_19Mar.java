package pckgsample;

public class Assign2_19Mar {
	
	public void mult(int a, int c)
	
	{
		int mult1=a*c;
		System.out.println("Multiplication using method 1 is:"+ mult1);
	}

	public void mult(float a, int b)
	{
		float multres= a*b;
		System.out.println("Multiplication using method 2 is:"+ multres);
	}
	
	public static void main(String[] args) {
		
		Assign2_19Mar obj1=new Assign2_19Mar();
		obj1.mult(3, 5);
		obj1.mult(4.5f, 2);
	}
}
