package edu.handong.csee.java.lab13.prob2; // package of prob2

public class Science extends Book // class Science which extends Book
{
	private String publisher; // private variable publisher

	public Science(String Name, String Publisher) // method science
	{
		super(Name); // refer parent's constructor
		this.publisher = Publisher; // put value of Publisher to Publisher
	}

	public String toString() // method toString
	{
		return super.toString() + "\n\tPublisher: " + publisher; // refer value of parents and add publisher
	}

	public void show() // method show
	{
		System.out.println("<<<Science>>>" + this.toString()); // print out <<<science>>> and value in toString
	}

}



