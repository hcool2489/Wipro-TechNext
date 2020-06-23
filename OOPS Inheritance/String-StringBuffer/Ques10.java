/*
Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
*/

import java.util.Scanner;

public class Ques10{
	private static StringBuffer nLastRep(String str, int n){
		String rep = str.substring(str.length()-n);
		StringBuffer resStr = new StringBuffer(rep);
		for(int i=1;i<n;i++)
			resStr.append(rep);
		return resStr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Strings and an integer:");
		System.out.println(nLastRep(sc.next(),sc.nextInt()));
	}
}