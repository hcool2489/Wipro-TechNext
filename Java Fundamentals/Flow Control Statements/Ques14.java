/*
Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
*/

public class Ques14{
	public static void main(String[] args){
		if(args.length>0){
			int num = Integer.parseInt(args[0]);
			int sum = 0;
			for(;num>0;num/=10)
				sum+=(num%10);
			System.out.println(sum);
		}
		else
			System.out.println("Command Line Input required");
	}
}