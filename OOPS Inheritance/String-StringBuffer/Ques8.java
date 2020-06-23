/*
Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
*/

import java.util.Scanner;

public class Ques8{
	private static StringBuffer cleanse(StringBuffer str){
		int index = str.indexOf("*");
		str.delete(index-1,index+2);
		return str;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		System.out.println(cleanse(new StringBuffer(sc.next())));
	}
}