/*
Write a program to check if a given number is prime or not.
*/

public class Ques12{
	public static void main(String[] args){
		if(args.length>0){
			int num = Integer.parseInt(args[0]);
			boolean isPrime = true;
			for(int i=2;i<num;i++){
				if(num%i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}
		else
			System.out.println("Enter any number in command line");
	}
}