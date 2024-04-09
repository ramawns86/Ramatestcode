package TestPackage;

public class Assignment1 {
	
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum Result: "+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z=x-y;
		System.out.println("Subtraction Result: "+z);
		return z;
	}
	public int mul(int l,int m)
	{
		int n=l*m;
		System.out.println("Multiplication Result: "+n);
		return n;
	}
	public void div(int p,int q)
	{
		int r=p/q;
		System.out.println("Division Result: "+r);
	}
	public static void main(String[] args) {
		
		Assignment1 result= new Assignment1();
		int sum_result = result.sum(10, 2);
		int sum_result1 = result.sum(sum_result, 2);
		int sub_result = result.sub(sum_result1, 2);
		int mul_result = result.mul(sub_result, 2);
		result.div(mul_result, 2);
	}
}
