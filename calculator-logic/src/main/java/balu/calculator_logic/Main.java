package balu.calculator_logic;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );        
        double x = 10;
        double y = 20;
        Calculator calculator = new Calculator();
        System.out.println(calculator.summation(x, y));
    }
}
