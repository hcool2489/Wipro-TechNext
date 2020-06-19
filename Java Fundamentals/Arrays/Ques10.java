/*
Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/

public class Ques10{
	private static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	private static void shiftRight(int[] arr, int index){
		int temp = arr[index];
		for(;index>0;index--){
			arr[index] = arr[index-1];
		}
		arr[0] = temp;
	}
	private static void evenOdd(int[] arr){
		for(int i=0;i<arr.length;i++)
			if(arr[i] % 2 == 0)
				shiftRight(arr,i);
	}
	public static void main(String[] args){
		int[] arr = {1, 0, 1, 0, 0, 1, 1};
		System.out.print("Initial Array: ");
		printArr(arr);
		evenOdd(arr);
		System.out.print("\nEvenOdd Array: ");
		printArr(arr);
	}
}