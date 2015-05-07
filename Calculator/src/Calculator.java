/**
 * @author Nora Osei
 * Date: 1/18/2015
 * Course: CS 220
 * Assignment: HW 2
 */
public class Calculator {

	//public static void main(String[] args) {
	//calculator tester that tester...run each method with expected

	//two operands
	private int x = 0;
	private int y = 0;

	//no arguement constructor
	public Calculator () 
	{
		int x = 0;
		int y = 0;	
	}

	//constructor
	public Calculator (int newX, int newY) 
	{
		x = newX;
		y = newY;
	}

	/** Adds two values.
	 * @return addition of two numbers
	 */

	public int add () {
		return x+y;
	}

	//sub
	public int sub() {
		return x-y;
	}

	//mutliply
	public int mult() {
		return x*y;
	}

	//divide
	public int div() {
		if (y==0) {
			System.out.println("You cannot divide by zero");
		}
		return x/y;
	}

	//set two values
	public void setXnY (int newX, int newY)
	{
		x = newX;
		y = newY;
	}

	//get x
	public int getX()
	{
		return x;
	}

	//get x
	public int getY()
	{
		return y;
	}
}


