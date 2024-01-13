
public class SumInArray {

	public static void main(String[] args) {
		//Ans 3: Program to calculate sum of all elements of an integer array
		int[] array=new int[] {-3,-2,-1,0,1,2,3,4};
		int sum=0;
		for(int i : array) {
			sum+=i;		
		}
		System.out.println("Sum is: "+sum);
	}
}
