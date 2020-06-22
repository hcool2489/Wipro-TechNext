/*
Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
*/

class Fruit{
	protected String name, taste;
	protected int size;
	
	public void eat(){
		System.out.println("Name: " + name + "\nTaste: " + taste);
	}
}

class Apple extends Fruit{
	public Apple(int size){
		this.name = "Apple";
		this.taste = "Sweet";
		this.size = size;
	}
	
	@Override
	public void eat(){
		System.out.println(name +  " is " + taste + " in taste.");
	}
}

class Orange extends Fruit{
	public Orange(int size){
		name = "Orange";
		taste = "Sour";
		this.size = size;
	}
	
	@Override
	public void eat(){
		System.out.println(name +  " is really " + taste + " in taste.");
	}
}

public class Ques1{
	public static void main(String[] args){
		Fruit fruit = new Apple(2);
		fruit.eat();
		fruit = new Orange(1);
		fruit.eat();
	}
}