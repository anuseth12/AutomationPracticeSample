package pckgsample;

public class Student {
	
	int age;
	int rollno;
	
	public void display1()
	{
		
	System.out.println("welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	
    public static void main(String[] args) {
		
    	Student stu=new Student();
    	stu.display1();
    	stu.display2();
    	stu.age=12;
    	stu.rollno=1234;
    	System.out.println(stu.age);
    	System.out.println(stu.rollno);
    	
    	
	}
}
