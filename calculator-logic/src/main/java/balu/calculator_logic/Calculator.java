package balu.calculator_logic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Calculator {
	@Setter
	@Getter
	private double x;
	@Setter
	@Getter
	private double y;
	
	public double summation(double x, double y) {		
		return  x + y; 
	}
	
	public double subtraction(double x, double y) {
		return  x - y;
	}
	
	public double division(double x, double y) { 
		if (y == 0 || x == 0) {
			return 0.0;
		} else {
			return x / y ;
		}	
	}
	
	public double multiplication(double x, double y) {
		return x * y;
	}
	
}
