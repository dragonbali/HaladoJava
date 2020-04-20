package balu.calculator_logic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator = new Calculator();

	@Test
	public void summationTest() {	
		assertThat(3.0, equalTo(calculator.summation(1.0, 2.0)));
	}
	
	@Test
	public void subtractionTest() {	
		assertThat(-1.0, equalTo(calculator.subtraction(1.0, 2.0)));
	}

	@Test
	public void multiplicationTest() {	
		assertThat(4.0, equalTo(calculator.multiplication(2.0, 2.0)));
	}
	
	@Test
	public void divisionTest() {	
		assertThat(1.0, equalTo(calculator.division(2.0, 2.0)));
		assertThat(0.0, equalTo(calculator.division(0.0, 2.0)));
		assertThat(0.0, equalTo(calculator.division(2.0, 0.0)));	
	}
}
