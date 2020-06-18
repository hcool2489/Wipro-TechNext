/*
Write a program to initialize an integer array and print the sum and average of the array.
*/

public class Ques1{
	public static void main(String[] args){
		int[] arr = {76,21,32,78,12,43,21,65,91,39,7};
		int sum = 0;
		System.out.print("Array: ");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
			sum+=arr[i];
		}
		System.out.println("\nSum: " + sum + "\nAverage: " + sum/arr.length);
	}
}