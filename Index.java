
public class Index {

	public static void main(String[] args) {
		//Ans 4: Program to find index of specific element in integer array;
		int array[]= {1,2,3,4,5,6,7,8,9};
		int searchElement=6;
		for(int i=0;i<array.length;i++) {
			if(array[i]==searchElement) {
				System.out.println(searchElement +" is found at index: "+ i);
				break;
			}
		}
	}
}
