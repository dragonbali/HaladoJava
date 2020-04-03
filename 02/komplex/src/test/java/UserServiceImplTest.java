import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
class UserServiceImplTest {

	@Mock
	UserModify um;
	
	@Mock
	List<Validator> validators;
	
	@InjectMocks
	UserServiceImpl us = new UserServiceImpl(um, validators);
	
	@BeforeEach
	void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testConstructor() {
		assertNotNull(us);
	}
	
	@Test
	public void saveTrueTest() {
		List<Validator> validators = new ArrayList<>();
		
		User u = mock(User.class);
		
		SpaceValidator sv = mock(SpaceValidator.class);
		when(sv.isValid(u)).thenReturn(true);
		
		LengthValidator lv = mock(LengthValidator.class);
		when(lv.isValid(u)).thenReturn(true);
		
		validators.add(sv);
		validators.add(lv);
		
		UserServiceImpl us = new UserServiceImpl(um, validators);
		
		us.save(u);
		
		verify(um, times(1)).save(u);	
	}
	
	@Test
	public void saveFalseTest() {
		List<Validator> validators = new ArrayList<>();
		
		User u = mock(User.class);
		
		SpaceValidator sv = mock(SpaceValidator.class);
		when(sv.isValid(u)).thenReturn(false);
		
		LengthValidator lv = mock(LengthValidator.class);
		when(lv.isValid(u)).thenReturn(false);
		
		validators.add(sv);
		validators.add(lv);
		
		UserServiceImpl us = new UserServiceImpl(um, validators);
		
		us.save(u);
		
		verify(um, times(0)).save(u);	
	}

}
