package LİnkedList;

public class Node {
   private Animals animal;
   private Node previous;
   private Node next;
   
   
   public Node() {
	   animal=null;
	   previous=null;
	   next=null;
   }
   public Node(Animals animal) {
	   setAnimal(animal);
	   setPrevious(null);
	   setNext(null);
   }
   public Node(Animals animal,Node previous,Node next) {
	   setAnimal(animal);
	   setPrevious(previous);
	   setNext(next);
   }
   
   
public Animals getAnimal() {
	return animal;
}
public void setAnimal(Animals animal) {
	this.animal = animal;
}
public Node getPrevious() {
	return previous;
}
public void setPrevious(Node previous) {
	this.previous = previous;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
   
}
