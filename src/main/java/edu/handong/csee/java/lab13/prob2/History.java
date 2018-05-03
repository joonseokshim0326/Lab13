package edu.handong.csee.java.lab13.prob2; // package of prob2

public class History extends Book // class History which extends Book
{
	private String Author; // private variable Author
	public History(String Name, String Author) // method History
	{
		super(Name); // refer parent's constructor
		this.Author = Author; // put value of Author to Author
	}
	public String toString() // method toString
	{
		return super.toString() + "\n\tAuthor: " + Author; // refer parents and add  Author 
	}
	public void show() // method show
	{
		System.out.println("<<<History>>>" + this.toString()); // print out <<<History>>> and value in toString
	}
}
