package balu.listingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import balu.listing_logic.Listing;
import balu.listing_logic.Student;
import balu.listing_logic.Task;
import balu.listing_logic.Teacher;

@Configuration
public class DependencyConfig {

	@Bean
	public Teacher teacher() {
		return new Teacher();
	}	
	@Bean
	public Student student() {
		return new Student();
	}	
	@Bean
	public Task task() {
		return new Task();
	}
	@Bean 
	Listing listing() {
		return new Listing();
	}
}
