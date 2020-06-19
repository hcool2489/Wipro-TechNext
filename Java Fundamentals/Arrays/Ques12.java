/*
Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
*/

public class Ques12{
	private static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	private static int[] middleWay(int[] a, int[] b){
		int[] res = {a[a.length/2], b[b.length/2]};
		return res;
	}
	public static void main(String[] args){
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		System.out.print("Array a: ");
		printArr(a);
		System.out.print("\nArray b: ");
		printArr(b);
		int[] arr = middleWay(a,b);
		System.out.print("\nMiddleWay Array: ");
		printArr(arr);
	}
}