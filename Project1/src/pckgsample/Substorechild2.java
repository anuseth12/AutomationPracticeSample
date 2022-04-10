package pckgsample;

public class Substorechild2 extends Substore
{
	
	public void substore_section1()
	{
		System.out.println("This is subsubstore's child section a");
	}
	
	public static void main(String[] args) {
		Substorechild2 s=new Substorechild2();
		s.price=32;
		System.out.println("Price inherited from grandparent class ="+ s.price);
		s.accessories();
		s.clothsection();
		s.shoes();
		s.section1();
		s.price2=155;
		System.out.println("Price inherited from father class ="+ s.price2);
		s.section1();
		
	}

}
