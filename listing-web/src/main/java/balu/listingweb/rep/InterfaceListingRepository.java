package balu.listingweb.rep;

import java.util.Date;
import java.util.List;

import balu.listingweb.dto.StudentDto;

public interface InterfaceListingRepository {

	Boolean notOrLate(Date deadline, Date receiptTime);
	List < Boolean > isOkList(List < StudentDto > students);
	List<StudentDto> getStudents();	
}
