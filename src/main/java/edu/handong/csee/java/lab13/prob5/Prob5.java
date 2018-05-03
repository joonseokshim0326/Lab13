package edu.handong.csee.java.lab13.prob5; // package of prob 5

import java.util.Scanner; // get Scanner from java library

public class Prob5 // class prob5
{
	public static boolean equals(int[][] m1, int[][] m2) // method equals
	{
		int count = 0; // initial value of variable count
		if (m1.length != m2.length) // if the number of row is different, return false
			return false; // returning value of false
		for (int i = 0; i < m1.length; i++) //  column of m1
		{
			for (int j = 0; j < m1[i].length; j++) // row of m1
			{
				if (m1[i][j] != m2[i][j]) // if two are different
					count++; // count = count +1
			}
		}
		if(count <= 3) // count <= 3
			return true; // returning value of true
		else // count >3
			return false; // returning vlaue of false
	}
	public static void main(String[] args) // main method
	{
		int n1, n2 = 0; // variable n1,n2
		Scanner keyboard = new Scanner(System.in); // instantiate keyboard
		System.out.print("Enter row size(maximum 5): "); // print out text
		n1 = keyboard.nextInt(); // get n1 from keyboard
		System.out.print("Enter column size(maximum 5): "); // print out text
		n2 = keyboard.nextInt(); // get n2 from keyboard
		int[][] m1 = new int[n1][n2]; // m1 = column n1, row n2
		System.out.print("Enter row size(maximum 5): "); // print out text
		n1 = keyboard.nextInt(); // get n1 from keyboard
		System.out.print("Enter column size(maximum 5): "); // print out text
		n2 = keyboard.nextInt(); // get n2 from keyboard
		int[][] m2 = new int[n1][n2]; // m2 = column n1 , row n2
		System.out.print("Enter List1: "); // print out text
		for (int i = 0; i < m1.length; i++) // column of m1
			for (int j = 0; j < m1[i].length; j++) // row of m1
				m1[i][j] = keyboard.nextInt();  // get m1 from keyboard

		System.out.print("Enter list2: "); // print out text
		for (int i = 0; i < m2.length; i++) // column of m2
		{
			for (int j = 0; j < m2[i].length; j++) // row of m2
				m2[i][j] = keyboard.nextInt(); // get m2 from keyboard
		}
		for (int i = 0; i < m1.length; i++) // column of m1
		{
			for (int j = 0; j < m1[i].length; j++) // row of m1
				System.out.print(m1[i][j] + " "); // print out m1
			System.out.println();// print out result from keyboard
		}
		System.out.println(); // print out result from keyboard
		for (int i = 0; i < m2.length; i++) // column of m2
		{
			for (int j = 0; j < m2[i].length; j++) // row of m2
				System.out.print(m2[i][j] + " "); // print out m2
			System.out.println(); // print out result from keyboard
		}
		System.out.println(); // print out result from keyboard


		if (equals(m1, m2)) // comparing m1 , m2
			System.out.println("The two arrays are approximately identical."); // print out if equals
		else // not equal
			System.out.println("The two arrays are not identical"); // print out if not equal



	}



}



