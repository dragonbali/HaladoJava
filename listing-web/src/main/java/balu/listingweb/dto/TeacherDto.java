package balu.listingweb.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {

	@NotNull
	private String teacherName;	
	@NotNull
	private List<StudentDto> students;
}