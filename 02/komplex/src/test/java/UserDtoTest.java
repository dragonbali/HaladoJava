import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class UserDtoTest {

	@Test
	public void userDtoCosntructorTest () {
		String name = "Balazs";
		UserDto udto = new UserDto(name);
		
		assertNotNull(udto);
		assertEquals(udto.getName(), name);	
	}
	
	@Test
	public void setNameTest(){
		String name = "Balazs";
		UserDto udto = new UserDto(name);
		
		assertEquals(udto.getName(), name);
	}
	
	@Test
	public void getNameTest(){
		UserDto udto = mock(UserDto.class);
		
		when(udto.getName()).thenReturn("Balazs");
		
		assertEquals(udto.getName(), "Balazs");				
	}
}
