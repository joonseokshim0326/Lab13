package edu.handong.csee.java.lab13.prob4; // package of prob4

import java.util.Scanner; // get Scanner from java library

public class Master  // class Master
{
	public void feed(Pet pet) // method feed
	{
		System.out.println("feed: " + pet.food()); // print out feed
	}

	public static void main(String[] args) // main method
	{
		String cat_name, dog_name; // variable cat_name, dog_name

		Master master = new Master(); // instantiate master
		Cat cat = new Cat(); // instantiate cat
		Dog dog = new Dog(); // instantiate dog

		Scanner keyboard = new Scanner(System.in); // instantiate keyboard
		System.out.print("Enter the cat name and dog name: "); // print out text
		cat_name = keyboard.next(); // get cat name from keyboard
		dog_name = keyboard.next(); // get dog name from keyboard

		cat.setName(cat_name);// put cat name to method setName
		cat.getName(); // put cat name to method getName
		master.feed(cat); // put cat in method feed

		dog.setName(dog_name); // put dog name to method setName
		dog.getName(); // put dog name to method getName
		master.feed(dog); // put dog in method feed
	}
}
