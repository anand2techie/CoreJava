package com.fullstack.rest.webservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fullstack.rest.webservices.model.User;

//Class to interact with the DB
@Service // or @Component
public class UserDaoService {

	// to be available whenever the class is loaded - JVM
	static List<User> usersMockDBList = new ArrayList<User>();

	// static block - will be initialized at the time of class loading itself. You
	// don't need to call manually.
	static {
		User user1 = new User("Ananth", "Chennai", new Date());
		User user2 = new User("Charles", "US", new Date());
		User user3 = new User("Dave", "UAE", new Date());

		usersMockDBList.add(user1);
		usersMockDBList.add(user2);
		usersMockDBList.add(user3);
	}

	// list of values pre-defined values - moved to a static block
	void setListMockedAsADatabase() {

	}

	// save - add
	public User save(User user) {
		usersMockDBList.add(user);
		return user;
	}

	// findOne - Ram
	public User findOne(String username) {
		// iterating a list: for loop, listIterator/Iterator, enhanced for loop
		/*
		 * Iterator<User> usersMockDBListItr = usersMockDBList.iterator(); // hasNext(),
		 * next(), remove() while (usersMockDBListItr.hasNext()) { User user =
		 * usersMockDBListItr.next(); if (username.equals(user.getUsername())) { return
		 * user; } }
		 */

		for (User user : usersMockDBList) {
			if (username.equals(user.getUsername())) {
				return user;
			}
		}
		return null;

	}

	// findAll
	public List<User> findAll() {
		return usersMockDBList;// this list contains all the data whatever present default and whatever you're
								// currently adding
	}

	public void delete(String username) {
		// usersMockDBList.remove(username); this is not working
		int i = 0;

		// we're iterating and the same time we're removing. This is not right. ==>
		// ConcurrentModificationException
		for (User user : usersMockDBList) {
			if (username.equals(user.getUsername())) {
				// usersMockDBList.remove(usersMockDBList.indexOf(username));
				break;
			}
			i++;
		}

		usersMockDBList.remove(i);

		// usersMockDBList.remove(usersMockDBList.indexOf(username)); again going to
		// fail, because you're passing string but the expected is, an user object

	}
}
