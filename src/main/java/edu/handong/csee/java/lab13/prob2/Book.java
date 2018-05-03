package edu.handong.csee.java.lab13.prob2; // package of prob2

public class Book // class Book
{


	private static int idCount = 0; // private variable idCount
	private String BookName; // private variable BookName
	private int id; // private variable id

	public Book(String Name) // method Book
	{
		this.BookName = Name; // put value of Name to this.BookName
		idCount++; // increase by 1
		id = idCount; // put value of idCount to id
	}

	public String toString() // method toString
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName; // returning value of id and BookName
	}
	public void show() // method show
	{
		System.out.println("<<<BOOK>>>" + this.toString()); // print out <<<BOOK>>> and value in toString
	}


}


