package balu.listingweb.serv;

import java.util.Date;
import java.util.List;

import balu.listingweb.dto.StudentDto;

public interface InterfaceListingService {
	
	 Boolean notOrLate (Date deadline, Date receiptTime);
	 List<Boolean> isOkList (List<StudentDto> students);
	 List<StudentDto> getStudents();	

}
