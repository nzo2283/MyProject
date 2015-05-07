//Nora Osei
//CS320A Data Structures
//Lab 3 Stacks
//Last Modified 10/18/2012
//Tester class that tests classes "ArrayStack" "ListStack" and "Node"

public class ArrayStackTester {

	public static void main(String[] args) {
		
		System.out.println("ArrayStack Class Tester:");
		System.out.println();
		
		//Creates a new array with 2 elements
		String[] people = new String[2];
		people[0] = "Jack";
		people[1] = "Sam";

		//Prints array of 2 predefined names
		ArrayStack friends = new ArrayStack(people);
		String output = friends.toString();
		System.out.println(output);
		System.out.println();

		//Prints array with "Nora" pushed on top
		friends.push("Nora");
		output = friends.toString();
		System.out.println(output + " <---- Nora is now pushed on to the array");
		
		//Pops first name on top of the array stack
		String popName = friends.pop();
		System.out.println();
		System.out.println(popName + " <---- The name that got popped off the array");
		System.out.println();
		output = friends.toString();
		System.out.println(output + " <---- Now Nora is popped off the array");
		System.out.println();
		
		//Returns the top of the array stack
		System.out.println(friends.top() + " <---- The top of the array stack");
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("ListStack Class Tester:");
		System.out.println();
		
		//Creates and prints the predefined list stack
		ListStack LS = new ListStack();
		output = LS.toString();
		System.out.println(output);
		System.out.println();
		
		//Prints the name on the top of list stack
		System.out.println(LS.top() + " <----- Name on the top of the stack");
		System.out.println();
		
		//Prints the name that gets popped on the top of the list stack
		System.out.println(LS.pop() + "<----- Name that gets popped");
		output = LS.toString();
		System.out.println(output);
		System.out.println();
		
		//Pushes a new name on the list stack and then prints the whole stack
		LS.push("Patrick");
		System.out.println(LS.toString());
		
	}
}
