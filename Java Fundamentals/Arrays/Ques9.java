/*
Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
*/

public class Ques9{
	private static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	private static void shiftLeft(int[] arr, int index){
		for(;index<arr.length-1;index++){
			arr[index] = arr[index+1];
		}
		arr[arr.length-1] = 0;
	}
	private static void withoutTen(int[] arr){
		for(int i=0;i<arr.length;i++)
			if(arr[i] == 10)
				shiftLeft(arr,i--);
	}
	public static void main(String[] args){
		int[] arr = {1, 10, 10, 2};
		System.out.print("Initial Array: ");
		printArr(arr);
		withoutTen(arr);
		System.out.print("\nWithoutTen Array: ");
		printArr(arr);
	}
}