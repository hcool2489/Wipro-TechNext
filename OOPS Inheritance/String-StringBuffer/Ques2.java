/*
Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate
*/

import java.util.Scanner;

public class Ques2{
	public static String conCat(String st1, String st2){
		if (st1.charAt(st1.length() - 1) == st2.charAt(0))
			return st1 + st2.substring(1);
		return st1 + ' ' + st2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 comma separated Strings: ");
		String str = new String(sc.next());
		String[] strings = str.split(",");
		System.out.println(conCat(strings[0].toLowerCase(),strings[1].toLowerCase()));
	}
}