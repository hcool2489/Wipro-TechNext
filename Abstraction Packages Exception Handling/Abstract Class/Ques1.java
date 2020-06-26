/*
Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behaviour of the notice method.
[i.e based on the random  number generated, the first compartment can be Luggage, the second one could be Ladies and so on..]
*/

import java.util.Random;

abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice(){
		return "Compartment: FirstClass";
	}
}
class Ladies extends Compartment{
	public String notice(){
		return "Compartment: Ladies";
	}
}
class General extends Compartment{
	public String notice(){
		return "Compartment: General";
	}
}
class Luggage extends Compartment{
	public String notice(){
		return "Compartment: Luggage";
	}
}
public class Ques1{
	private static void assign(){}
	public static void main(String[] args){
		Compartment[] train = new Compartment[10];
		Random random = new Random();
		for(int i=0;i<train.length;i++){
			switch(random.nextInt(4)+1){
				case 1:
					train[i] = new FirstClass();
					break;
				case 2:
					train[i] = new Ladies();
					break;
				case 3:
					train[i] = new General();
					break;
				case 4:
					train[i] = new Luggage();
					break;
			}
		}
		System.out.println("\nFinal Train with " + train.length + " Compartments are as follows:\n");
		for(int i=0;i<train.length;i++)
			System.out.println(train[i].notice());
	}
}