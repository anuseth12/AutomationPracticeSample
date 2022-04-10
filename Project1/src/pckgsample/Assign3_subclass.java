package pckgsample;



public class Assign3_subclass extends Assign3_19Mar {

	
	public void clothsection()
	{
		System.out.println("This is main store childs apparel section");
		
	}
	
	public void accessories()
	{
		System.out.println("This is main store child accessories section");
	}
	
	public void shoes()
	{
		System.out.println("This is main store child grand shoes section");
	}
	
	public static void main(String[] args) {
		Assign3_subclass obj1= new Assign3_subclass();
		obj1.clothsection();
		obj1.accessories();
		
				
	}
}
