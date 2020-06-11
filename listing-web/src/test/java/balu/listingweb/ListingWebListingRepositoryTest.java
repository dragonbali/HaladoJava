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
		
		System.out.println(deadline1.compareTo(receiptTime1) > 0);
		System.out.println(repository.notOrLate(deadline1, receiptTime1));
		
		assertFalse(repository.notOrLate(deadline1, receiptTime1));
	}
	
	@Test
	public void notOrLateTest2() {
		init();
		
		@SuppressWarnings("deprecation")
		Date deadline1 = new Date(2020,5,20);
		Date receiptTime1 = null;
		
		assertFalse(repository.notOrLate(deadline1, receiptTime1));	
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void isOkListTest() {
		init();	
		
		List < Boolean > result = new ArrayList < Boolean > ();
		result.add(true);
		
		List < StudentDto > students = mock(List.class);
		when(repository.isOkList(students)).thenReturn(result);
		assertEquals(result, repository.isOkList(students));		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	public void isOkListTest() {
		init();		
		//List < TeacherDto > teachers = new ArrayList < TeacherDto > ();
		//List < TaskDto > tasks = new ArrayList < TaskDto > ();				
		@SuppressWarnings("deprecation")
		Date deadline1 = new Date(2020,5,20);		
		@SuppressWarnings("deprecation")
		Date receiptTime1 = new Date(2020,5,12);
		
		List < StudentDto > students = new ArrayList < StudentDto > ();
		
		TaskDto task = mock(TaskDto.class);
		when(task.getDeadline()).thenReturn(deadline1);
		when(task.getReceiptTime()).thenReturn(receiptTime1);	
		
		//tasks.add(task);
		
		//StudentDto student = new StudentDto("Név", teachers, tasks);
		
		//List < StudentDto > students = new ArrayList < StudentDto > ();
		//students.add(student);
		
		List < Boolean > result = new ArrayList < Boolean > ();
		result.add(false);
		
		assertEquals(result,repository.isOkList(students));
		
	}*/
	
	/*@Test
	@SuppressWarnings("unchecked")
	public void isOkListTest2() {
		init();	
		
		@SuppressWarnings("deprecation")
		Date deadline1 = new Date(2020,5,20);
		
		@SuppressWarnings("deprecation")
		Date receiptTime1 = new Date(2020,5,12);
		
		List < StudentDto > students = mock(List.class);
		List < TeacherDto > teachers = mock(List.class);
		List < TaskDto > tasks = mock(List.class);
		TaskDto task = mock(TaskDto.class);
		
		when(task.getDeadline()).thenReturn(deadline1);
		when(task.getReceiptTime()).thenReturn(receiptTime1);
		
		
		TaskDto testTask = new TaskDto("Töri ZH", deadline1, receiptTime1, true, "negyedik világháború régen lesz. Mindent le tudok róla írni.", "nagyon jo megoldas!");
		
		tasks.add(testTask);
		StudentDto student = new StudentDto("Név", teachers, tasks);
		
		students.add(student);
		
		List < Boolean > result = new ArrayList < Boolean > ();
		result.add(true);
		
		System.out.println(student);
		
		assertEquals(result, repository.isOkList(students));
		
		
	}*/
	
	/*@SuppressWarnings("unchecked")
	@Test
	public void isOkListTest3() {
		init();	
		@SuppressWarnings("deprecation")
		Date deadline1 = new Date(2020,5,20);
		
		@SuppressWarnings("deprecation")
		Date receiptTime1 = new Date(2020,5,12);
		
		@SuppressWarnings("deprecation")
		Date deadline2 = new Date(2020,6,20);
		
		@SuppressWarnings("deprecation")
		Date receiptTime2 = new Date(2020,6,22);
		
		@SuppressWarnings("deprecation")
		Date deadline3 = new Date(2020,5,10);
		
		@SuppressWarnings("deprecation")
		Date receiptTime3 = new Date(2020,5,12);
		
		List < TeacherDto > teachers = mock(List.class);
		
		
		 List<StudentDto> students = new ArrayList<StudentDto>();	

		 List<TaskDto> tasks1 = new ArrayList<TaskDto>();
		 List<TaskDto> tasks2 = new ArrayList<TaskDto>();
		
		TaskDto testTask = new TaskDto("Töri ZH", deadline1, receiptTime1, true, "negyedik világháború régen lesz. Mindent le tudok róla írni.", "nagyon jo megoldas!");
		TaskDto testTask2 = new TaskDto("Töri Vizsga", deadline2, receiptTime2, true, "honfoglalás 896-ban volt, de nem tudom kik csinálták.", "ez nagyon rossz volt!");
		TaskDto testTask3 = new TaskDto("Közös Testnevelés", deadline3, receiptTime3, true, "konditerem (10 alkalmat teljesítette)", "Nagyon izmos lettél!");
		
		StudentDto testStud = new StudentDto("Aladár",teachers,tasks1);
		StudentDto testStud2 = new StudentDto("Béla",teachers,tasks2);
		
		
			students.add(testStud);
			students.add(testStud2);			
			tasks1.add(testTask);
			tasks2.add(testTask2);
			tasks2.add(testTask3);
		
			List < Boolean > result = new ArrayList < Boolean > ();
			result.add(true);
			result.add(false);
			
			assertEquals(result, repository.isOkList(students));
		
	}*/
	

	

	
}
