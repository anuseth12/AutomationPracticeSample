package pckgsample;

public class swapwithout3rdvar {
	
	public static void main(String[] args) {
		
	
	
	int a=34,b=39;
	
	
	System.out.println("Value of var a before swapping:"+ a);
	System.out.println("Value of var b before swapping:"+ b);
	
	a= a+b;
	b= a-b;
	a=a-b;
	
	System.out.println("***********************************");
	System.out.println("Value of var a after swapping:"+ a);
	System.out.println("Value of var b after swapping:"+ b);
	}
}
