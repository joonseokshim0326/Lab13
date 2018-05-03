package edu.handong.csee.java.lab13.prob3; // package of prob3

public class Rectangle extends Shape //  class Rectangle which extends Shaped 
{
	private double length; // private variable length
	private double width; // private variable width
	public Rectangle(double length, double width) // method Rectangle
	{
		this.length = length; // put length to length
		this.width = width; // put width to width
	}
	public double area() // method area
	{
		return length * width; // returning value of area
	}
	public double perimeter() // method perimeter
	{
		return 2*(length+width); // returning value of perimeter
	}
	public double get_Length() // method get_Length
	{
		return length; // returning value of length
	}
	public double get_Width() // method get_Width
	{
		return width; // returning value of width
	}
}
