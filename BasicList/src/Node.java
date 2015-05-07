//Nora Osei
//CS320A Data Structures
//Lab 2 Basic List
//Last Modified 10/15/2012
//This class contains a constructor that creates a specific node with a 
// string value and a reference to the next Node with accessor and mutator methods.


public class Node {
 private String name;
 private Node next;
 
 //Creates a node & a string value 
 public Node(String s, Node n){
	 name = s;
	 next = n;
 }
 

public String getName() { 
	 return name;
 }
 
 public Node getNext() {
	 return next;
 }
 
 public void setName(String newName) {
	 name = newName;
 }
 
 public void setNext(Node newNext) {
	 next = newNext;
 }
 
 }
 

