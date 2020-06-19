/*
Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/

public class Ques14{
	private static void print2d(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	private static int largest2d(int[][] arr){
		int max = arr[0][0];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				if(arr[i][j] > max)
					max = arr[i][j];
		return max;
	}
    public static void main(String[] args){
		if(args.length == 9){
			int j=0, k=0;
			int[][] arr=new int[3][3];
			for(int i=0; i<9; i++){
				arr[j][k++] = Integer.parseInt(args[i]);
				if(k==3){
					j++;
					k=0;
				}
			}
			System.out.println("The given array is :");
			print2d(arr);
			System.out.println("\nThe biggest number in the given array is " + largest2d(arr));
		}else
			System.out.println("Please enter 9 integer numbers");
    }
}