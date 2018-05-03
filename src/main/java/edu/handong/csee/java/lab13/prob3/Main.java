package edu.handong.csee.java.lab13.prob3; // package of prob3

import java.util.Scanner; // get Scanner from java library

public class Main // class Main
{

	public static void main(String[] args) // main method 
	{

		double n1, n2; // variable n1,n2
		Scanner keyboard = new Scanner(System.in); // instatiate keyboard

		System.out.print("Enter radius: "); // print out text
		n1 = keyboard.nextDouble(); // get double value n1 from keyboard
		Circle c1 = new Circle(n1); // put n1 to Circle

		System.out.println("Radius: "+ c1.get_Radius()); // print out text
		c1.display(); // print out result

		System.out.print("Enter length and width: "); // print out text
		n1 = keyboard.nextDouble(); // get n1 from keyboard
		n2 = keyboard.nextDouble(); // get n2 from keyboard
		Rectangle r1 = new Rectangle(n1, n2); // put n1,n2 to Rectangle

		System.out.println("Length: "+ r1.get_Length()); // print out Length
		System.out.println("Width: "+ r1.get_Width()); // print out Width
		r1.display(); // print out result
	}



}
