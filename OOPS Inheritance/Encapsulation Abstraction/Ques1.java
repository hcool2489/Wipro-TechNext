/*
Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parametrized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parametrized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)
*/

class Author{
	String name, email;
	char gender;
	
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String bookName, double price, int qtyInStock, String authorName, String authorEmail, char authorGender){
		this.name = bookName;
		author = new Author(authorName, authorEmail, authorGender);
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public Book(String bookName, double price, int qtyInStock, Author author){
		this.name = bookName;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public int getQty(){
		return qtyInStock;
	}
	public Author getAuthor(){
		return author;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setQty(int qtyInStock){
		this.qtyInStock = qtyInStock;
	}
	public void setAuthor(String name, String email, char gender){
		this.author.name = name;
		this.author.email = email;
		this.author.gender = gender;
	}
	public void setAuthor(Author author){
		this.author = author;
	}
	public void getDetails(){
		System.out.println("---------- " + name + " ----------\nPrice: " + price + "\nQty in Stock: " + qtyInStock + "\n\nBy, " + author.name + "\nEmail: " + author.email + "\nGender: " + (author.gender == 'm'?"Male":author.gender == 'f'?"Female":"UNK") + "\n\n");
	}
}

public class Ques1{
	public static void main(String[] args){
		Book b101 = new Book("Harry", 217, 10, "J.K. Rowling", "jk@rowling.com", 'f');
		Book b304 = new Book("The Invisible Man", 183, 25, new Author("Ralph", "ralphy@wells.com", 'm'));
		
		b101.setName(b101.getName() + " Potter");
		
		Author hg = new Author("H.G. Wells", "hg@wells.com", 'm');
		b304.setAuthor(hg);
		
		b101.getDetails();
		b304.getDetails();
	}
}