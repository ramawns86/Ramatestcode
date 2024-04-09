package TestPackage;

public class TestConstructor {
	public TestConstructor() {
		this(20,40,60);
		System.out.println("Default Constructor");
	}
	public TestConstructor(int a) {
		this(20,40,60,80);
		System.out.println("One Parametrized Constructor");
	}
	public TestConstructor(int a, int b) {
		this(20);
		System.out.println("Two Parametrized Constructor");
	}
	public TestConstructor(int a, int b, int c) {
		System.out.println("Three Parametrized Constructor");
	}
	public TestConstructor(int a, int b, int c, int d) {
		this();
		System.out.println("Four Parametrized Constructor");
	}
	public static void main(String[] args) {
		TestConstructor cons= new TestConstructor(20,40);
	}

}
