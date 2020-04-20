package balu.calculatorweb;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import balu.calculator_logic.Calculator;
import balu.calculatorweb.dto.OperandDto;

@Controller
public class MainController {
	
	private Calculator calculator;
	double result;
	
	@Autowired
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@GetMapping(value = "/")
	public ModelAndView getRoot() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		result = 0.0;
		return mav;
	}
	
	@GetMapping (value = "/calculator")
	public ModelAndView getCalculator() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("calculator");
		mav.addObject("operandDto", new OperandDto());
		mav.addObject("result", result);
		result = 0.0;
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="summation", method = RequestMethod.POST)
	public ModelAndView summation(@Valid OperandDto operandDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("/calculator");
			mav.addObject("operandDto", operandDto);
			return mav;
		}
		mav.addObject("operandDto", operandDto);
		result = calculator.summation(operandDto.getX(), operandDto.getY());	
		mav.setViewName("redirect:/calculator");
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="subtraction", method = RequestMethod.POST)
	public ModelAndView subtraction(@Valid OperandDto operandDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("/calculator");
			mav.addObject("operandDto", operandDto);
			return mav;
		}
		mav.addObject("operandDto", operandDto);
		result = calculator.subtraction(operandDto.getX(), operandDto.getY());		
		mav.setViewName("redirect:/calculator");
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="multiplication", method = RequestMethod.POST)
	public ModelAndView multiplication(@Valid OperandDto operandDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("/calculator");
			mav.addObject("operandDto", operandDto);
			return mav;
		}
		mav.addObject("operandDto", operandDto);
		result = calculator.multiplication(operandDto.getX(), operandDto.getY());		
		mav.setViewName("redirect:/calculator");
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="division", method = RequestMethod.POST)
	public ModelAndView division(@Valid OperandDto operandDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("/calculator");
			mav.addObject("operandDto", operandDto);
			return mav;
		}
		mav.addObject("operandDto", operandDto);
		result = calculator.division(operandDto.getX(), operandDto.getY());		
		mav.setViewName("redirect:/calculator");
		return mav;
	}

}
