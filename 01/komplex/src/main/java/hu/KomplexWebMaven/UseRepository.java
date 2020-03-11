package hu.KomplexWebMaven;

import java.util.ArrayList;

public class UseRepository {
	
	ArrayList<User> users = new ArrayList<User>();

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
	public ArrayList<User> findAll() {
		return users;
	}
	
	public ArrayList<User> findByEnableIsTrue() {
		ArrayList<User> result = new ArrayList<User>();
		for (User user : users) {
			if (user.isEnable()) {
				result.add(user);
			}
		}
		return result;
	}
	
}
