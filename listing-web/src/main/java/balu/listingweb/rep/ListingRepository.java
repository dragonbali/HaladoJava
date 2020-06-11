package balu.listingweb.rep;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import balu.listingweb.dto.StudentDto;
import balu.listingweb.dto.TaskDto;
import balu.listingweb.dto.TeacherDto;
import lombok.Getter;

@Repository
public class ListingRepository {

    public Boolean notOrLate(Date deadline, Date receiptTime) {
    	return deadline.compareTo(receiptTime) > 0;
        }

    public List < Boolean > isOkList(List < StudentDto > students) {
        List < Boolean > result = new ArrayList < Boolean > ();
        List < TaskDto > tempTask = new ArrayList < TaskDto > ();
        boolean tempBool = true;
        for (StudentDto student: students) {

            tempTask = student.getTasks();
            for (TaskDto task: tempTask) {

                if (tempBool = true) {

                    if (task.getReceiptTime() == null) {
                        tempBool = false;
                    } else {
                        if (task.getDeadline().compareTo(task.getReceiptTime()) > 0) {
                            tempBool = true;
                        } else {
                            tempBool = false;
                        }
                    }

                }

            }
            result.add(tempBool);
        }
        return result;
    }


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
	Date receiptTime3 = new Date(2020,5,18);
	
	@Getter
	 List<StudentDto> students = new ArrayList<StudentDto>();	
	 List<TeacherDto> teachers = new ArrayList<TeacherDto>();
	 List<TaskDto> tasks1 = new ArrayList<TaskDto>();
	 List<TaskDto> tasks2 = new ArrayList<TaskDto>();
	
	TaskDto testTask = new TaskDto("Töri ZH", deadline1, receiptTime1, true, "negyedik világháború régen lesz. Mindent le tudok róla írni.", "nagyon jo megoldas!");
	TaskDto testTask2 = new TaskDto("Töri Vizsga", deadline2, receiptTime2, false, "honfoglalás 896-ban volt, de nem tudom kik csinálták.", "ez nagyon rossz volt!");
	TaskDto testTask3 = new TaskDto("Közös Testnevelés", deadline3, receiptTime3, false, "konditerem (10 alkalmat teljesítette)", "Nagyon izmos lettél!");
	
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