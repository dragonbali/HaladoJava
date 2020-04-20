package balu.calculatorweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import balu.calculator_logic.Calculator;

@Configuration
public class DependencyConfig {

	@Bean
	public Calculator calculator() {
		return new Calculator();
	}
}
