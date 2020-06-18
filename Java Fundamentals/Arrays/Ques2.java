/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
*/

public class Ques2{
	public static void main(String[] args){
		int[] arr = {76,21,32,78,12,43,21,65,91,39,7};
		int min = arr[0];
		int max = arr[0];
		System.out.print("Array: ");
		for(int i=1;i<arr.length;i++){
			System.out.print(arr[i] + " ");
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("\nMIN: " + min + "\nMAX: " + max);
	}
}