package pckgsample;

import java.util.Scanner;

public class Swapwith3var {
	
	
	
	public static void main(String[] args) {
		
		int c;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s.nextInt();
		
		System.out.println("Enter value of b");
		int b=s.nextInt();
		
				
		System.out.println("Value of var a before swapping:"+ a);
		System.out.println("Value of var b before swapping:"+ b);
		
		c=a;  // c-->10
		a=b;  //b--->20
		b=c;  //b--->10
		System.out.println("***********************************");
		System.out.println("Value of var a after swapping:"+ a);
		System.out.println("Value of var b after swapping:"+ b);
		
		
		
		
		
	}

}
