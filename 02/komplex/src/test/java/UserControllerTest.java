import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class UserControllerTest {

	@Mock
	UserService us;
	
	@Mock
	NeptunCodeGenerator ngen;
	
	@InjectMocks
	UserController uc = new UserController(us, ngen);
	
	@Mock
	UserDto uDto;
	
	@Mock
	User user;
	
	@BeforeEach
	void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void saveTest() {		
		uc.save(uDto);
		
		verify(us, times(1)).save(Mockito.any(User.class));	
	}

}
