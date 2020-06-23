/*
Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
*/

import java.util.Scanner;

public class Ques5{
	private static String trimALittle(String str){
		return str.substring(1,str.length()-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.next();
		System.out.println(trimALittle(str));
	}
}