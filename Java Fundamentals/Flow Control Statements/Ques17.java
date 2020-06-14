/*
Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/

public class Ques17{
	public static void main(String[] args){
		if(args.length>0){
			int num = Integer.parseInt(args[0]);
			int rev = 0;
			while(num>0){
				rev = rev*10+num%10;
				num/=10;
			}
			num = Integer.parseInt(args[0]);
			if(num == rev)
				System.out.println(num + " is a palindrome");
			else
				System.out.println(num + " is not a palindrome");
		}
		else
			System.out.println("Please enter an integer number");
	}
}