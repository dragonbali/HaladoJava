import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

class LengthValidatorTest {

	LengthValidator lv = new LengthValidator();
	
	@Test
	public void isValidShortTest(){	
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("Abi");
		
		assertFalse(lv.isValid(user));				
	}	
	
	@Test
	void isValidLongTest() {
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("Dzsenifer");
		
		assertTrue(lv.isValid(user));
	}
	
}
