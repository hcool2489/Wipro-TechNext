/*
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
*/

public class Ques13{
	private static void print2d(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	private static int[][] reverse2d(int[][] arr){
		int[][] rev = new int[2][2];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				rev[1-i][1-j] = arr[i][j];
		return rev;
	}
    public static void main(String[] args){
		if(args.length == 4){
			int j=0, k=0;
			int[][] arr=new int[2][2];
			for(int i=0; i<4; i++){
				arr[j][k++] = Integer.parseInt(args[i]);
				if(k==2){
					j++;
					k=0;
				}
			}
			System.out.println("The given array is :");
			print2d(arr);
			arr = reverse2d(arr);
			System.out.println("\nThe reverse of the array is :");
			print2d(arr);
		}else
			System.out.println("Please enter 4 integer numbers");
    }
}