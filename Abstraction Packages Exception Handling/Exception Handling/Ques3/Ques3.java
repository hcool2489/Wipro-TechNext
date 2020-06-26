/*
Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/

import java.util.Scanner;

public class Ques3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			String name = "";
			int[] sub = new int[3];
			
			try{
				System.out.print("\nEnter Name: ");
				name = sc.nextLine();
				for(int j=0;j<3;j++){
					if (sc.hasNextInt())
						sub[j] = sc.nextInt();
					else
						throw new NumberFormatException();
					if (sub[j] < 0) throw new NegativeValuesException();
					if (sub[j] > 100) throw new ValuesOutOfRangeException();
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: " + name);
			for(int j=0;j<3;j++)
				System.out.println("Marks of subject " + (char)(65+j) + ": " + sub[j]);
			sc.nextLine();
		}
	}
}