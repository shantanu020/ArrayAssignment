
public class MethodOverloading {
	int add(int a,int b,int c)
	{
		int result1=a+b;
		return result1;
	}
	double add(double a,double b,double c)
	{
		double result2=a+b;
		return result2;
	}
	public static void main(String[] args)
	{
		//Ans 1: method overloading using 3 different parameters
		int a=2;
		int b=3;
		int c=4;
		MethodOverloading obj=new MethodOverloading();
		int result1=obj.add(a,b,c);
		System.out.println(result1);
		double result2=obj.add(a, b,c);
		System.out.println(result2);
		
	}

}
 
