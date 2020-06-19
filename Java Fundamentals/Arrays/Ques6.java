/*
Write a program to initialize an array and print them in a sorted order.
*/

public class Ques6{
    public static void printArray(int []arr){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        int[] arr = {76,21,32,78,12,43,21,65,91,39,7};
		System.out.print("Original Array: ");
		printArray(arr);
		for(int i=1; i<arr.length; i++){
			int z=arr[i];
			for(int j=i; j>0; j--){
				if(arr[j]<arr[j-1]){
					arr[j]=arr[j-1];
					arr[j-1]=z;
				}
				else
					break;
			}
		}
		System.out.print("\nSorted Array: ");
		printArray(arr);
    }
}