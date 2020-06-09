package balu.listingweb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import balu.listingweb.dto.StudentDto;
import balu.listingweb.dto.TaskDto;
import balu.listingweb.dto.TeacherDto;
import balu.listingweb.rep.ListingRepository;
import balu.listingweb.serv.ListingService;

@Controller
public class MainController {

	private ListingRepository listingRepository = new ListingRepository();
	private ListingService listingService= new ListingService(listingRepository);
	
	@GetMapping("/")
	public String getTeacherPage() {
		return "teacher";
	}
		
	int counter = 0;
	@GetMapping("/all")
	public ModelAndView showAll() {
		ModelAndView mav = new ModelAndView();
	    mav.addObject("students", students);
	    mav.setViewName("all");	    
	    return mav;
	}
	
	@RequestMapping(value = "all", params = "index", method = RequestMethod.POST)
	public ModelAndView listAllStudents(int index) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("details");
		mav.addObject("student",students.get(index));
		return mav;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * Fake DB
	 * init
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	@Autowired
	public void setDB() {
		fakeDBSet();
	}
	
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
	
	 List<StudentDto> students = new ArrayList<StudentDto>();	
	 List<TeacherDto> teachers = new ArrayList<TeacherDto>();
	 List<TaskDto> tasks1 = new ArrayList<TaskDto>();
	 List<TaskDto> tasks2 = new ArrayList<TaskDto>();
	
	TaskDto testTask = new TaskDto("Töri ZH", deadline1, receiptTime1, listingService.notOrLate(deadline1, receiptTime1), "negyedik világháború", "nagyon jo megoldas!");
	TaskDto testTask2 = new TaskDto("Töri Vizsga", deadline2, receiptTime2, listingService.notOrLate(deadline2, receiptTime2), "honfoglalás", "ez nagyon rossz volt!");
	TaskDto testTask3 = new TaskDto("Közös Testnevelés", deadline3, receiptTime3, listingService.notOrLate(deadline3, receiptTime3), "konditerem (10 alkalmat teljesítette)", "Nagyon izmos lettél!");
	
	TeacherDto testTeacher = new TeacherDto("Anna Néni",students);
	TeacherDto testTeacher2 = new TeacherDto("Feri Bácsi",students);
	
	StudentDto testStud = new StudentDto("Aladár",teachers,tasks1);
	StudentDto testStud2 = new StudentDto("Béla",teachers,tasks2);
	
	public void fakeDBSet () {
		students.add(testStud);
		students.add(testStud2);		
		teachers.add(testTeacher);
		teachers.add(testTeacher2);		
		tasks1.add(testTask);
		tasks2.add(testTask2);
		tasks2.add(testTask3);
	}
	
}
