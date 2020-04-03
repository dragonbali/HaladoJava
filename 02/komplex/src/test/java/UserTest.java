import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTest {
	
	@Test
	void UserConstructorTest() {
		String name = "Balazs";	
		boolean enabled = true;	
		String neptun ="neptun123";
		
		User user = new User(name, enabled , neptun);
		
		assertEquals(name, user.getName());
		assertEquals(neptun, user.getNeptunkod());
		assertEquals(enabled, user.isEnabled());			
	}

}
