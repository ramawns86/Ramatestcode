package TestPackage;

public class Student {
	
	int rollNo, age;
	
	public static void Display1()
	{
		System.out.println("Welcome to all of you");
	}
	public static void Display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
	System.out.println("Welcome to the class");	
		
	Student stud=new Student();
	stud.rollNo=1214;
	stud.age=27;
	System.out.println("Student Roll Number:"+stud.rollNo);
	System.out.println("Student Age:"+stud.age);
	stud.Display1();
	stud.Display2();
		
	}

}
