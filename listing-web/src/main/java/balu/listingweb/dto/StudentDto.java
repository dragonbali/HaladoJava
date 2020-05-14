package balu.listingweb.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	@NotNull
	private String studentName;
	@NotNull
	private List<TeacherDto> teachers;
	@NotNull
	private List<TaskDto> tasks;
}
