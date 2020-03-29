package org.komplex.feladat;

import java.util.ArrayList;
import java.util.List;

public class UseRepository {
	
	List<User> users = new ArrayList<User>();

	public void save(User user){
		System.out.printf("%s mentve%n",user.getUserName());
		users.add(user);
	}
	public User getByNeptunKod(String neptunkod) {
		for (User user : users) {
			if (user.getNeptun().equals(neptunkod)) {
				return user;
			}
		}
		return null;
	}
	public List<User> findAll() {
		return users;
	}
	
	public List<User> findByEnableIsTrue() {
		List<User> result = new ArrayList<User>();
		for (User user : users) {
			if (user.isEnable()) {
				result.add(user);
			}
		}
		return result;
	}
	
}
