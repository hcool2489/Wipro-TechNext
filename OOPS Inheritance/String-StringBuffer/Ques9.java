/*
Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod
*/

import java.util.Scanner;

public class Ques9{
	private static StringBuffer mergeStrings(String a, String b){
		int alen = a.length();
		int blen = b.length();
		StringBuffer str = new StringBuffer(alen+blen);
		for(int i=0,j=0;i<alen||j<blen;i++,j++){
			if(i==alen){
				str.append(b.substring(j));
				break;
			}
			if(j==blen){
				str.append(a.substring(i));
				break;
			}
			str.append(a.charAt(i));
			str.append(b.charAt(j));
		}
		return str;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings:");
		System.out.println(mergeStrings(sc.next(),sc.next()));
	}
}