package balu.listingweb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import balu.listingweb.dto.StudentDto;
import balu.listingweb.dto.TaskDto;
import balu.listingweb.dto.TeacherDto;

@Controller
public class MainController {

	
	@GetMapping("/")
	public String getTeacherPage() {
		return "teacher";
	}
		
	@RequestMapping(value = "all", params = "index", method = RequestMethod.POST)
	public ModelAndView listAllStudents(int index) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("index",index);
		mav.setViewName("details");
		mav.addObject("students",students);
		return mav;		
	}
	
	int counter = 0;
	@GetMapping("/all")
	public String showAll(Model model) {
	    model.addAttribute("students", students);
	    return "all";
	}
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * Fake DB
	 * Fake DB
	 * Fake DB
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	@Autowired
	public void setDB() {
		fakeDBSet();
	}
	
	Date teatDate = new Date();
	
	 List<StudentDto> students = new ArrayList<StudentDto>();	
	 List<TeacherDto> teachers = new ArrayList<TeacherDto>();
	 List<TaskDto> tasks1 = new ArrayList<TaskDto>();
	 List<TaskDto> tasks2 = new ArrayList<TaskDto>();
	
	TaskDto testTask = new TaskDto("Töri ZH", teatDate, true, "negyedik világháború", "nagyon jo megoldas!");
	TaskDto testTask2 = new TaskDto("Töri Vizsga", teatDate, false, "honfoglalás", "ez nagyon rossz volt!");
	TaskDto testTask3 = new TaskDto("Közös Testnevelés", teatDate, true, "konditerem (10 alkalmat teljesítette)", "Nagyon izmos lettél!");
	
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
