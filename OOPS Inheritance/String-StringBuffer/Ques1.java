/*
Write a Program to check whether a given String is Palindrome or not.
*/

import java.util.Scanner;

public class Ques1{
	private static boolean isPalindrome(String str){
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
			if(str.charAt(i) != str.charAt(j))
				return false;
		return true;
	}
	public static void main(String[] args){
		System.out.println("Enter a string to check for palindrome: ");
		String str = new String(new Scanner(System.in).nextLine());
		
		//Trimming preceding and ending extra spaces
		System.out.println(isPalindrome(str.trim()));
	}
}