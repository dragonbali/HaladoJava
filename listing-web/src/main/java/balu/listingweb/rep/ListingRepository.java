package balu.listingweb.rep;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ListingRepository {
	
	public Boolean notOrLate (Date deadline, Date receiptTime) {
		if (receiptTime == null) {
			return false;
		}
		if (deadline.compareTo(receiptTime) > 0) {
			return true;
		}
			return false;
	}

}
