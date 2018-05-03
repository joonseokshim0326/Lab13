package edu.handong.csee.java.lab13.prob1; // package of prob1

public class InstanceOf // class InstanceOf
{
	public static void WhatFriend(Friend friend) // method WhatFriend
	{
		if(friend instanceof ClassFriend) // check out type of friend
			((ClassFriend) friend).classFriend(); // if true friend is class friend
		else if(friend instanceof SchoolFriend) // check out type of friend
			((SchoolFriend) friend).schoolFriend(); // if true friend is school friend
		else // check out type of friend
			friend.JustFriend(); // if true friend is JustFriend
	}



}
