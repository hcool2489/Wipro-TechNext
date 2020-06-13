/*
Write a program to check if a given integer number is odd or even.
*/

public class Ques2{
	public static void main(String[] args){
		if(new java.util.Scanner(System.in).nextInt() % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}