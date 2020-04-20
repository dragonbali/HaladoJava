package balu.calculator_console;

import balu.calculator_logic.Calculator;

public class App 
{
    public static void main( String[] args )
    {   
   	  	
    	if (!args[0].equals("calculator")) {
			System.out.println("Your first argument has to be ''calculator'', if you want to calculate something");
			System.out.println("The second has to be your operator");
			System.out.println("The third has to be your first operand");
			System.out.println("And the fourth has to be your second operand");
			System.exit(0); 
		}
    	
        System.out.println("Hello!\nThis is my calculator console application.\n");
        System.out.println("Your input was: " + args[2] + args[1] + args[3]);
        System.out.print("Result: ");
        
        String operator = args[1];
         
        double x = 0;
        double y = 0;
      
        if (isNumeric(args[2])) {
        	x = Double.parseDouble(args[2]);
		} else {
			System.out.println("Wrong first operand");
			System.exit(0); 
		}
        
        if (isNumeric(args[3])) {
        	y = Double.parseDouble(args[3]);
		} else {
			System.out.println("Wrong second operand");
			System.exit(0); 
		}
        
        Calculator calculator = new Calculator();
        
        switch (operator) {
		case "+":
			System.out.println(calculator.summation(x, y));
			break;
		case "-":
			System.out.println(calculator.subtraction(x, y));
			break;
		case "*":
			System.out.println(calculator.multiplication(x, y));
			break;
		case "/":
			if (y == 0) {
				System.out.println("Cannot divide by zero");
				System.exit(0); 
			}
			System.out.println(calculator.division(x, y));
			break;	
		default:
			System.out.println("Wrong operator");
		}
     
	}
       
    public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }       
        return true;     
    }
    
}
