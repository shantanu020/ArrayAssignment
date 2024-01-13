
public class PrintArray 
{
	int[]array=new int[] {1,2,3,4,5};
	void print(int array[]) 
	{
		for(int n:array) 
		{
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args)
	{
		//Ans 5: Program to print an entire array
		
		PrintArray a=new PrintArray();
		a.print(a.array);
		
	}

}
