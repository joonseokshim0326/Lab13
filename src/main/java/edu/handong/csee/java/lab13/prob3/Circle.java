package edu.handong.csee.java.lab13.prob3; // package of prob3

public class Circle extends Shape // class Circle which extends Shape
{
	private double radius; // private variable radius
	public Circle(double r) // class Circle
	{
		radius = r; // put value of r to radius
	}
	public double area() // method area
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r
	}
	public double perimeter() // method perimeter
	{
		return 2.0 * Math.PI * radius; // 2 * pi * radius
	}
	public double get_Radius() // method get_Radius
	{
		return radius; // returning value of radius
	}
}

