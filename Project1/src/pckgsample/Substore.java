package pckgsample;

public class Substore extends MainStore{

	int price2;
	public void section1()
	{
		System.out.println("This is substore's child section a");
	}
	
	public static void main(String[] args) {
		Substore s=new Substore();
		s.price=32;
		System.out.println("Price inherited from parent class ="+ s.price);
		s.accessories();
		s.clothsection();
		s.shoes();
		s.section1();
		
	}
}
