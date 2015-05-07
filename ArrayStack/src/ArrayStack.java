//Nora Osei
//CS320A Data Structures
//Lab 3 Stacks
//Last Modified 10/18/2012


import java.util.Arrays;


public class ArrayStack {

	String[] people;

	//Constructor that creates an empty array 
	public ArrayStack() {

		people = new String[0];
	}

	
	//Constructor that initialize stack with names
	public ArrayStack(String[] names) {

		people = names;
	}

	
	//Pushes name on stack, returns true if it works
	boolean push(String name) {
		String[] pushArray = new String [people.length + 1];
		pushArray[people.length] = name;
		for(int i=0; i<people.length; i++) {
			pushArray[i] = people[i];
		}
		people = pushArray;
		return true;
	}

	
	//Pops the name on the top of the stack, returns the popped name
	public String pop() {
		String[] popArray = new String [people.length - 1];
		String poppedName = people[people.length -1];
		for(int i=0; i<popArray.length; i++) {
			popArray[i] = people[i];
		}
		people = popArray;
		return poppedName;
	}

	
	//Returns the name on the top of the stack
	public String top() {
		String topName = people[people.length -1];
		return topName;
	}

	
	//Returns the number of elements currently in the stack
	public int size() {
		int x =	people.length; 
		return x;
	}

	
	//Returns a string representation of the current stack
	public String toString() {
		String peopleString = Arrays.toString(people);
		return peopleString;
	}
	
	
	//Returns true if stack is empty, otherwise returns false
	public boolean isEmpty() {
		return people[0]==null;

	}
}
