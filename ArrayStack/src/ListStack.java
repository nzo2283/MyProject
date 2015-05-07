//Nora Osei
//CS320A Data Structures
//Lab 3 Stacks
//Last Modified 10/18/2012


public class ListStack {
	protected Node head;
	protected long size;

	//Constructor that creates an empty list stack
	public ListStack(int x) {
		head = null;
		size = 0;	
	}

	//Constructor that creates a list stack with an initialized stack of names
	public ListStack() {
		head = null;
		size = 0;
		addFirst(new Node("Sam", null));
		addFirst(new Node("Mary", null));
		addFirst(new Node("Martha", null));
		addFirst(new Node("John", null));
		addFirst(new Node("Joe", null));
		addFirst(new Node("Fred", null));
	}


	//Method that adds the names to the list stack in the constructor
	public boolean addFirst(Node name) { 

		name.setNext(head);
		head = name;
		size ++;
		return true;
	}


	//Insert method to add names into list stack
	boolean push(String name) { 

		Node a = new Node(name, head);
		head = a;
		return true;
	}


	//Pops the name in the front of the list stack
	public String pop() {
		String oldHead = head.getName();
		head = (head.getNext()); 
		size --;
		return oldHead; 
	}


	//Returns the name in the front of the list stack
	public String top() {
		return head.getName();
	}


	//Returns the number of elements currently in the list stack
	public int size() {
		return (int) size;
	}

	
	//Print method
	public String toString() { 
		Node newHead = head;
		String nodeNames = "";
		for(int i=0; i<size; i++) {
			nodeNames += (newHead.getName() + " ");
			newHead = newHead.getNext();
		}

		return nodeNames;
	}

	
	//Checks if empty
	boolean isEmpty() { 
		return (head == null); 

	}

}
