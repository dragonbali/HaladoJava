import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class UseRepositoryTest {
	
	UseRepository urep = new UseRepository();

	@Test
	public void saveTest() {		
		//benne van igy a findAll() tesztje is.
		User user = mock(User.class);
		
		when(user.getName()).thenReturn("Balazs");
		
		urep.save(user);
		
		assertEquals(urep.findAll().get(0), user);
		assertEquals(urep.findAll().size(), 1);
	}
		
	@Test	
	public void getByNeptunKodTest() {		
		User user = mock(User.class);
		
		String neptunkodCorrect = "asd123";
		String neptunkodWrong = "dsa321";
			
		when(user.getNeptunkod()).thenReturn(neptunkodCorrect);
		
		urep.save(user);
		
		assertEquals(urep.getByNeptunKod(neptunkodCorrect), user);
		
		assertEquals(urep.getByNeptunKod(neptunkodWrong), null);
	}
	
	@Test
	public void findByEnabledIsTrueTest() {			
		User user = mock(User.class);		
		when(user.isEnabled()).thenReturn(true);
		urep.save(user);
		
		User user2 = mock(User.class);
		when(user2.isEnabled()).thenReturn(false);		
		urep.save(user2);		
		
		assertEquals(urep.findByEnabledIsTrue().get(0), user); //az eslo volt igaz, vagyis a 0.indexu
		
		assertEquals(urep.findByEnabledIsTrue().size(), 1); //es csak egy elem van, ami igaz
	}
	
}
