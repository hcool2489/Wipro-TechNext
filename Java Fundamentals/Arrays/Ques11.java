/*
Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
*/

public class Ques11{
	private static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	private static boolean only14(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 1 || arr[i] == 4)
				continue;
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		int[] arr = {1, 4, 1, 4};
		System.out.print("Array: ");
		printArr(arr);
		System.out.println("\nonly14 -> " + only14(arr));
	}
}