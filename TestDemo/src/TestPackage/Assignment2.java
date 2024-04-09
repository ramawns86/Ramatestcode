package TestPackage;

public class Assignment2 {
	public int sum(int a,int b)
	{
		int c1;
		c1=a+b;
		return c1;
	}
public int sub(int a,int b)
{
	int c2;
	c2=a-b;
	return c2;
}
public int mul(int a,int b)
{
	int c3;
	c3=a*b;
	return c3;
}
public int div(int a,int b)
{
	int c4;
	c4=a/b;
	return c4;
}
public static void main(String[] args) {
	Assignment2 result = new Assignment2();
	int result1 = result.sum(10, 2);
	int result2 = result.sum(result1, 2);
	int result3 = result.sub(result2, 2);
	int result4 = result.mul(result3, 2);
	int result5 = result.div(result4, 2);
	System.out.println("Final result: "+result5);
	int result6 = result.mul(10, 2);
	int result7 = result.sum(result6, 2);
	int result8 = result.sub(result7, 2);
	int result9 = result.mul(result8, 2);
	int result10 = result.div(result9, 2);
	System.out.println("Final result2: "+result10);
}

}
