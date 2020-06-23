/*
Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
*/

import java.util.Scanner;

public class Ques3{
	private static StringBuffer getncopies(String str){
		StringBuffer newStr = new StringBuffer(2*str.length());
		for(int i=0;i<str.length();i++){
			newStr.append(str.charAt(0));
			newStr.append(str.charAt(1));
		}
		return newStr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.next();
		System.out.println(getncopies(str));
	}
}