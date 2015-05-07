//Nora Osei
//CS320A Data Structures
//Lab 3 Stacks
//Last Modified 10/18/2012
//This class contains a constructor that creates a specific node with a 
//string value and a reference to the next Node with accessor and mutator methods.


public class Node {
 private String name;
 private Node next;
 
 //Constructor that creates a node & a string value 
 public Node(String s, Node n){
	 name = s;
	 next = n;
 }
 
//Method to get name
public String getName() { 
	 return name;
 }
 

//Method to get the next name
 public Node getNext() {
	 return next;
 }
 
 
 //Method that sets the new name
 public void setName(String newName) {
	 name = newName;
 }
 
 
 //Method that sets the next pointer
 public void setNext(Node newNext) {
	 next = newNext;
 }
 
 }
 

