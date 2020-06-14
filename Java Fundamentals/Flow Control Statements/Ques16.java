/*
Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
*/

public class Ques16{
	public static void main(String[] args){
		if(args.length>0){
			int num = Integer.parseInt(args[0]);
			int rev = 0;
			while(num>0){
				rev = rev*10+num%10;
				num/=10;
			}
			System.out.println(rev);
		}
		else
			System.out.println("Please enter an integer number");
	}
}