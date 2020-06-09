package balu.listingweb.serv;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import balu.listingweb.rep.ListingRepository;

@Service
public class ListingService {
	
	@Autowired
	ListingRepository listingRepository;
	
	public ListingService(ListingRepository listingRepository) {
		this.listingRepository = listingRepository;
	}
	
	public Boolean notOrLate (Date deadline, Date receiptTime) {
		return  listingRepository.notOrLate(deadline, receiptTime);
	}
}
