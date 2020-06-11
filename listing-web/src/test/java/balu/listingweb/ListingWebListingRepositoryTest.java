package balu.listingweb;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import balu.listingweb.dto.StudentDto;
import balu.listingweb.rep.ListingRepository;
import balu.listingweb.serv.ListingService;

@SpringBootTest
class ListingWebListingRepositoryTest {

	@InjectMocks
	ListingService service;
	
	@Mock
	ListingRepository repository;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void notOrLateTest() {		
		@SuppressWarnings("deprecation")
		Date deadline1 = new Date(2020,12,20);
		
		@SuppressWarnings("deprecation")
		Date receiptTime1 = new Date(2010,12,12);
		
		when(repository.notOrLate(deadline1, receiptTime1)).thenReturn(false);
		assertFalse(service.notOrLate(deadline1, receiptTime1));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void isOkListTest() {
		init();	
		
		List < Boolean > result = new ArrayList < Boolean > ();
		result.add(true);
		
		List < StudentDto > students = mock(List.class);
		when(repository.isOkList(students)).thenReturn(result);
		assertEquals(result, service.isOkList(students));		
	}

}
