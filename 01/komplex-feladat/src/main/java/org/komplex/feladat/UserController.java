package org.komplex.feladat;
import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
	
	public class UseRepository{
		UseRepository useRepository = new UseRepository();
		ArrayList<Validator> validators = new ArrayList<Validator>();
		
		public void save(User user){
			useRepository.save(user);
		}
		
	@SuppressWarnings("unused")
	private boolean isValid(User user){
		for (Validator validator : validators) {
			if (!validator.isValid(user)) {
				return false;
			}
		}
		return true;
	}	
	}

	public static void main(String[] args) {

		ArrayList<User> u = new ArrayList<User>();
		
			@SuppressWarnings("resource")
			Scanner sr = new Scanner(System.in);
			
			System.out.println("Enter username");
			String tempUserName = sr.nextLine();
			
			System.out.println("Enter password");
			String tempPW = sr.nextLine();
			
			if ((tempUserName.length() > 5) && (tempPW.length() > 5)) {
				if ((tempUserName.indexOf(" ") == -1) && (tempPW.indexOf(" ") == -1)) {

					User objt = new User(tempUserName, tempPW, false, "ABCD12"); // Creating a new object
					u.add(objt); // Adding it to the list			
				}	
			}

			for (User useri : u) {
				System.out.println(useri.toString());
			}
	}

}
