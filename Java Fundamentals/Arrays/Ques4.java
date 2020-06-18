/*
Initialize an integer array with ascii values and print the corresponding character values in a single row.
*/

public class Ques4{
	public static void main(String[] args){
		int[] arr = {105,73,103,88,97,84,90};
		System.out.print("ASCII Array: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.print("\nCharacters: ");
		for(int i=0;i<arr.length;i++)
			System.out.print((char)arr[i] + " ");
	}
}