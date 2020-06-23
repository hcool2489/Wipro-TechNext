/*
Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
*/

import java.util.Scanner;

public class Ques6{
	private static String shortLongShort(String st1, String st2){
		if(st1.length() != 0 && st2.length() != 0){
			if(st1.length() < st2.length())
				return st1 + st2 + st1;
			else
				return st2 + st1 + st2;
		}
		return st1 + st2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 String:");
		System.out.println(shortLongShort(sc.next(),sc.next()));
	}
}