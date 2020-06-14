/*
Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *

*/

public class Ques15{
	public static void main(String[] args){
		if(args.length>0){
			int num = Integer.parseInt(args[0]);
			for(int i=0;i<num;i++){
				int j=0;
				while(j<=i){
					System.out.print("* ");
					j++;
				}
				System.out.println();
			}
		}
		else
			System.out.println("Please enter an integer number");
	}
}