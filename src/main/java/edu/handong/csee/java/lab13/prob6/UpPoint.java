package edu.handong.csee.java.lab13.prob6; // package of prob6

public class UpPoint implements CapitalPrintable // class UpPoint
{
	private int x, y; // private variable x,y

	UpPoint(int x, int y){this.x = x; this.y = y;} // put each value to x,y

	public String toString() // method toString
	{
		return "x : " + x + " y : " + y; // returning value of x,y
	}



}
