/*
Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/

public class Ques3{
	private static int search(int[] arr, int num){
		for(int i=0;i<arr.length;i++)
			if(arr[i] == num)
				return i;
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {1,4,34,56,7};
		int num1 = 90;
		int num2 = 56;
		System.out.println(num1 + " is at " + search(arr,num1));
		System.out.println(num2 + " is at " + search(arr,num2));
	}
}