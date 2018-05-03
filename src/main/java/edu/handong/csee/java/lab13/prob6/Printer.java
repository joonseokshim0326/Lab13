package edu.handong.csee.java.lab13.prob6; // package of prob6

public class Printer // class Printer 
{
	public static void print(Object object) // method print
	{
		String str = object.toString(); // put value of object toString to str
		if(object instanceof CapitalPrintable) // check out type of object
			str = str.toUpperCase(); // to upper
		System.out.println(str); // print out upper result
	}



}
