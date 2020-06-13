/*
	B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
*/

import java.util.Scanner;

public class Ques1B{
	private static boolean lastDigit(int n1, int n2){
		if((n1%10) == (n2%10))
			return true;
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(lastDigit(sc.nextInt(),sc.nextInt()));
	}
}