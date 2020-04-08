package balu.calculatorweb;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import balu.calculator_logic.Calculator;
import balu.calculatorweb.dto.MoveDto;

@Controller
public class MainController {
	
Calculator calculator = new Calculator();

	@GetMapping(value = "/")
	@ResponseBody
	public ModelAndView getRoot() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@GetMapping (value = "/calculator")
	public ModelAndView getCalculator() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("calculator");
		mav.addObject("data", new MoveDto());
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="summation", method = RequestMethod.POST)
	public ModelAndView summation(@Valid MoveDto moveDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("errorpage");
			return mav;
		}
		mav.addObject("data", moveDto);
		double result = calculator.summation(moveDto.getX(), moveDto.getY());		
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="subtraction", method = RequestMethod.POST)
	public ModelAndView subtraction(@Valid MoveDto moveDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("errorpage");
			return mav;
		}
		mav.addObject("data", moveDto);
		double result = calculator.subtraction(moveDto.getX(), moveDto.getY());		
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="multiplication", method = RequestMethod.POST)
	public ModelAndView multiplication(@Valid MoveDto moveDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("errorpage");
			return mav;
		}
		mav.addObject("data", moveDto);
		double result = calculator.multiplication(moveDto.getX(), moveDto.getY());		
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping(value="/calculator", params="division", method = RequestMethod.POST)
	public ModelAndView division(@Valid MoveDto moveDto, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();	
		if (bindingResult.hasErrors()) {
			mav.setViewName("errorpage");
			return mav;
		}
		mav.addObject("data", moveDto);
		double result = calculator.division(moveDto.getX(), moveDto.getY());		
		mav.addObject("result", result);
		return mav;
	}
	
	@GetMapping (value = "/calculatorPro")
	public ModelAndView getCalculatorPro() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("calculatorPro");
		return mav;
	}

}
