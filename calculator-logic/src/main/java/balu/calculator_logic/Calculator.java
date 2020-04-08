package balu.calculator_logic;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Calculator {
	@Setter
	private double x;
	@Setter
	private double y;
	
	public double summation(double x, double y) {		
		return  x + y; 
	}
	
	public double subtraction(double x, double y) {
		return  x - y;
	}
	
	public double division(double x, double y) { 
		return x / y ;
	}
	
	public double multiplication(double x, double y) {
		return x * y;
	}
	
}
