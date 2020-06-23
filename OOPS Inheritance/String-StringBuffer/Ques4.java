/*
Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)
i/p:TomCat
o/p:Tom

Example2)
i/p:Apron
o/p:null
*/

import java.util.Scanner;

public class Ques4{
	private static String oddEven(String str){
		if(str.length() % 2 == 0)
			return str.substring(0,str.length()/2);
		return "null";
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.next();
		System.out.println(oddEven(str));
	}
}