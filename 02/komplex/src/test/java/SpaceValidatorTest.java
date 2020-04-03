import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SpaceValidatorTest {

	SpaceValidator sv = new SpaceValidator();
	
	@Test
	public void isValidNoSpaceTest(){		
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("Balazs");
		
		assertTrue(sv.isValid(user));				
	}	
	
	@Test
	void isValidLongTest() {
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("Arany Janos");
		
		assertFalse(sv.isValid(user));
	}

}
