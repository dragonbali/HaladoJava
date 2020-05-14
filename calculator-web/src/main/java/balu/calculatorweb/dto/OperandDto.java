package balu.calculatorweb.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperandDto {
	@NotNull
	private Double x;
	@NotNull
	private Double y;
}