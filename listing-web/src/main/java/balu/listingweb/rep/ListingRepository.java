package balu.listingweb.rep;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import balu.listingweb.dto.StudentDto;
import balu.listingweb.dto.TaskDto;

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
}