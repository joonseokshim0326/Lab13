package edu.handong.csee.java.lab13.prob6; // package of prob6

public class Prob6 // class prob6 
{

	public static void main(String[] args) // main method
	{
		UpPoint p1 = new UpPoint(3,3); // p1 (3,3)
		DownPoint p2 = new DownPoint(2,5); // p2 (2,5)
		DownPoint p3 = new DownPoint(4,7); // p3 (4,7)
		UpPoint p4 = new UpPoint(9,12); // p4 (9,12)
		Printer.print(p1); // put p1 to printer
		Printer.print(p2); // put p2 to printer
		Printer.print(p3); // put p3 to printer
		Printer.print(p4); // put p4 to printer
	}
}
