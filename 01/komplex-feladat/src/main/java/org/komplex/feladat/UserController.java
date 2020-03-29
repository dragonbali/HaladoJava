package org.komplex.feladat;
import java.util.ArrayList;
import java.util.List;


public class UserController {

		UseRepository useRepository = new UseRepository();
		List<Validator> validators = new ArrayList<Validator>();
		
		public void save(User user){
			if(isValid(user))useRepository.save(user);
		}
		
		
		private boolean isValid(User user){
			for (Validator validator : validators) {
				if (!validator.isValid(user)) {
					return false;
				}
			}
			return true;
		}	
	}


