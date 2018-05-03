package edu.handong.csee.java.lab13.prob1; // package of prob1

public class Prob1 // class prob1
{

	public static void main(String[] args) // main method
	{
		// TODO Auto-generated method stub
		Friend friend1 = new Friend(); // instantiate friend1
		SchoolFriend friend2 = new SchoolFriend(); // instantiate friend2
		ClassFriend friend3 = new ClassFriend(); // instantiate friend3

		InstanceOf.WhatFriend(friend1); // check type of friend1 using InstanceOf
		InstanceOf.WhatFriend(friend2); // check type of friend2 using InstanceOf
		InstanceOf.WhatFriend(friend3); // check type of friend3 using InstanceOf


	}

}
