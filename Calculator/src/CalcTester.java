/**
 * @author Nora Osei
 * Date: 1/18/2015
 * Course: CS 220
 * Assignment: HW 2
 */

public class CalcTester {

	public static void main(String[] args) {

		Calculator newCalc = new Calculator();

		//Instance Variables that hold answers to basic operands
		int sumAdd = newCalc.add();
		int sumSub = newCalc.sub();
		int multAns = newCalc.mult();
		//int divAns = newCalc.div();


		//Sets two values 
		newCalc.setXnY(30, 10);
		System.out.println("Value1: " + newCalc.getX());
		System.out.println("Value2: " + newCalc.getY());
		System.out.println();

		//Checks the "add" method
		sumAdd = newCalc.add();
		System.out.println("Addition Actual: " + sumAdd);
		System.out.println("Addition Expected:40");
		System.out.println();

		//Checks the "sub" method
		sumSub = newCalc.sub();
		System.out.println("Subtraction Actual: " + sumSub);
		System.out.println("Subtraction Expected: 20");
		System.out.println();

		//Checks the "mult" method
		multAns = newCalc.mult();
		System.out.println("Multipcation Actual: " + multAns);
		System.out.println("Multipcation Expected: 300");
		System.out.println();

		//Checks the "div" method
		newCalc.setXnY(5, 10);
		if (newCalc.getY() == 0) {
			System.out.println("Cannot divide by 0");
		} else { 
		//	System.out.println("Division Actual: " + divAns);
			System.out.println("Division Expected: " + 3);
			System.out.println();

		}
	}


}





