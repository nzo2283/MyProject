//Nora Osei
//Last Modified 10/15/2012
//This class contains a constructor that initializes a list and contains methods to insert, 
//find, remove and print the list and check if the list is empty. 

public class List {
	protected Node head;
	protected long size;

	//Constructs an list with given parameters
	public List() { 
		head = null;
		size = 0;
		addFirst(new Node("Sam", null));
		addFirst(new Node("Mary", null));
		addFirst(new Node("Martha", null));
		addFirst(new Node("John", null));
		addFirst(new Node("Joe", null));
		addFirst(new Node("Fred", null));
	}
	
	
	//Method that adds the names to the linked list in the constructor
	public boolean addFirst(Node name) { 

		name.setNext(head);
		head = name;
		size ++;
		return true;
	}
	
	
	//Insert method to add names into linked list
	Boolean insert(String name) { 
		Node newHead = head;
		Node a = new Node(name, null);
		
		if(head==null) {
			head = a;
			size++;
			return true;
		}
		
		for(int i=0; i<size; i++ ){ 
			
		//Inserts name in the front of the list
			if(name.compareTo(newHead.getName())<0) {
				a.setNext(newHead);
				head = a;
				size++;
				return true;
			}
			
			// Inserts name at the end of the list
			if(newHead.getNext()==null) {
				newHead.setNext(a);
				size++;
				return true;
			}
			
			// Inserts name into list
			if(name.compareTo(newHead.getName())>0) {
				if(name.compareTo(newHead.getNext().getName())<0) 
			{
			if(i==size-1) {
				newHead.setNext(a);
				size++;
				return true;
			}
			a.setNext(newHead.getNext());
			newHead.setNext(a);
			size++;
			return true;
			
			}
			newHead = newHead.getNext();
		
			}
		}
		return false;
	}

	//Finds name in linked list
	public void find (String name) { 
		Node newHead = head;
		for(int i=0; i<size; i++) {
			if(name.compareTo(newHead.getName())==0);
		}
		 newHead = head.getNext();	
	}

	//Removes name in linked list
	Boolean remove(String name) { 
		Node newHead = head;
	for(int i=0; i<size-1; i++) {
			if(name.compareTo(newHead.getNext().getName())==0){
				newHead.setNext(newHead.getNext().getNext());
				size--;
				return true;
			}
			newHead = newHead.getNext();
		}
		return false;
	}
	
	
	//Print method
	public void print() { 
		Node newHead = head;
		for(int i=0; i<size; i++) {
			System.out.println(newHead.getName());
			newHead = newHead.getNext();
		}

	}
	//Checks if empty
	boolean isEmpty() { 
		return (head == null); 
		
	}
}
