package edu.handong.csee.java.lab13.prob3; // package of prob3

public abstract class Shape // class Shape 
{
	public abstract double area(); // abstract method area
	public abstract double perimeter(); // abstract method perimeter
	public void display() // method display
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n"); // print out result of Area , Perimeter
	}
}

