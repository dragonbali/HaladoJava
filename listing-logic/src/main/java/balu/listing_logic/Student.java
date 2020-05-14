package balu.listing_logic;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class Student {

	@Getter
	private String studentName;
	@Getter
	private List<Teacher> teachers;
	@Getter
	private List<Task> tasks;
}
