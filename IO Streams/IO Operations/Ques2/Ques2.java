/*
Write a program to copy contents from one file to another and check the output.

Sample Input and Output:
Enter the input file name
Input.txt
Enter the output file name
Output.txt
File is copied.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input file name(Input.txt): ");
		String inputFilename = sc.nextLine();
		System.out.print("Enter the output file name(Output.txt): ");
		String outputFilename = sc.nextLine();
	
		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		
		br.close();
		bw.close();
		sc.close();
	}
}