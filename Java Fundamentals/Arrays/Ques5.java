/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/

public class Ques5{
	public static void main(String[] args){
		int[] arr = {76,21,32,78,12,43,21,65,91,39,7};
		int min = 100;
		int mint = min;
		int max = 0;
		int maxt = max;
		System.out.print("Array: " + arr[0] + " ");
		for(int i=1;i<arr.length;i++){
			System.out.print(arr[i] + " ");
			if(arr[i]<min){
				mint = min;
				min = arr[i];
			}
			if(arr[i]>max){
				maxt = max;
				max = arr[i];
			}
		}
		System.out.println("\nLargest 2 nos: " + max + " and " + maxt + "\nSmallest 2 nos: " + min + " and " + mint);
	}
}