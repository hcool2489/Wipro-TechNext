/*
Write a program to print prime numbers between 10 and 99.
*/

public class Ques13{
	private static boolean isPrime(int num){
		for(int i=2;i<num;i++)
			if(num%i == 0)
				return false;
		return true;
	}
	public static void main(String[] args){
		for(int i=10;i<100;i++){
			if(isPrime(i))
				System.out.println(i);
		}
	}
}