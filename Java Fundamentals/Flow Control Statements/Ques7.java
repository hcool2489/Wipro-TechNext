/*
Initialize a character variable with an alphabet in a program.

If the character value is in lower case, the output should be displayed in upper case in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in upper case, the output should be displayed in lower case in the following format.

Example2)
i/p:A
o/p:A->a
*/

public class Ques7{
	public static void main(String[] args){
		if(args.length > 0){
			char ch = args[0].charAt(0);
			if(ch >= 65 && ch <= 90)
				System.out.println(ch + "->" + (ch+=32));
			else if(ch >= 97 && ch <= 122)
				System.out.println(ch + "->" + (ch-=32));
			else
				System.out.println("Not an Alphabet!");
		}
		else
			System.out.println("No Input received");
	}
}