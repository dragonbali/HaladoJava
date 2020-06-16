package balu.listingweb.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

	@NotNull
	private String title;
	@NotNull
	private Date deadline;
	private Date receiptTime;
	@NotNull
	private String solution;
	@NotNull
	private String comment;
}
