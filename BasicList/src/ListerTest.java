//Nora Osei
//Last Modified 10/15/2012
//This class uses the List class to create a list, print it, 
//remove an item from it and demonstrate the correct handling of an empty list.

public class ListerTest {

	public static void main(String[] args) {
		//Creates new object List
		List newList = new List();
		newList.print();
		
		//Inserts names into the list
		newList.insert("Adam");
		System.out.println();
		newList.insert("Nora");
		System.out.println();
		newList.insert("Zach");
		newList.print();
		
		//Removes name from the list
		newList.remove("Nora");
		System.out.println();
		newList.print();
		//System.out.println();
		
		//Handles the exception of an empty list
		if(newList.isEmpty()) {
			System.out.println("Empty List");
		}

	}

}
