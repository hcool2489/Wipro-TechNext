/*
Create a class named 'Animal' which includes methods like eat() and sleep().

Create a child class of Animal named 'Bird' and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/

class Animal{
	public void eat(){
		System.out.println("Eating...");
	}
	public void sleep(){
		System.out.println("Sleeping...");
	}
}

class Bird extends Animal{
	@Override
	public void eat(){
		for(int i=0;i<5;i++)
			System.out.print("nom! ");
		System.out.println();
	}
	public void sleep(){
		for(int i=0;i<5;i++)
			System.out.print("zzZzZ... ");
		System.out.println();
	}
	public void fly(){
		for(int i=0;i<5;i++)
			System.out.print(" \\ WoooHooo / ");
		System.out.println();
	}
}

class Ques1{
	public static void main(String[] args){
		Animal someAnimal = new Animal();
		System.out.println("This is an Animal ->");
		someAnimal.eat();
		someAnimal.sleep();
		
		Bird someBird = new Bird();
		System.out.println("\n\nThis is a Bird ->");
		someBird.eat();
		someBird.sleep();
		someBird.fly();
	}
}