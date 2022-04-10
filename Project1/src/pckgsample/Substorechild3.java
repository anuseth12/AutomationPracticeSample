package pckgsample;

public class Substorechild3 extends MainStore {
	
	public void substore_section1()
	{
		System.out.println("This is subsubstore's child section a");
	}
	
	public static void main(String[] args) {
		Substorechild3 s=new Substorechild3();
		s.price=32;
		System.out.println("Price inherited from grandparent class ="+ s.price);
		s.accessories();
		s.clothsection();
		s.shoes();
		s.substore_section1();
		
	}

}
