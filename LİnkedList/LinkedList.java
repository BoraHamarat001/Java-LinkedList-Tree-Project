package LİnkedList;



public class LinkedList {
  private Node first;
  private Node last;
  private int length;
  private String habitat; 
  
  public LinkedList(String habitat) {
	  setFirst(null);
	  setLast(null);
	  length=0;
	  this.habitat=habitat;
  }
  public LinkedList(Node first) {
	  setFirst(first);
	  setLast(null);
	  length=1;
  }
  public Node getFirst() {
	return first;
}
public void setFirst(Node first) {
	this.first = first;
}
public Node getLast() {
	return last;
}
public void setLast(Node last) {
	this.last = last;
}

//METHODS
public void addToFront(Animals animal) {//ADDING FRONT
	Node node=new Node(animal);
	if (first==null) {
		insert(animal);
	}else {
	node.setNext(first);
	first.setPrevious(node);
	first=node;
	node.setPrevious(null);
	length++;
	}
}
public void removeFromFront() {//REMOVING FRONT
	first=first.getNext();
	first.setPrevious(null);
	length--;
}
public void addToBack(Animals animal) {//ADDING BACK
	if(first==null) {
	insert(animal);
	}else {
	Node node=new Node(animal);
	node.setPrevious(last);
	node.setNext(null);
	last.setNext(node);
	last=last.getNext();
	length++;
	}
}
public void removeFromBack() {//REMOVING BACK
	last=last.getPrevious();
	last.setNext(null);
	length--;
}
public void outputBackward() {//PRINT BACKWARD
	Node current=last;
	while(current!=null) {
		System.out.print(current.getAnimal().getSpecies()+"-->");
		current=current.getPrevious();
	}
}
public void outputForward() {
	Node current=first;
	while(current!=null) {
		System.out.print("-->"+current.getAnimal().getSpecies());
		current=current.getNext();
	}
}
public void insert(Animals animal) {
	Node node=new Node(animal);
	if(first==null) {
		first=last=node;
		length++;
	}else {
		addToBack(animal);
		length++;
	}
}
public String search(String animal) {
	int order=1;
	Node current=first;
	animal=animal.toLowerCase();
	while(current!=null) {
		if(current.getAnimal().getSpecies().equals(animal)) {
			System.out.println(current.getAnimal()+"\n------");
			System.out.print("ORDER:"+order+"\n------"+"\nANIMAL:");
			return current.getAnimal().getSpecies().toLowerCase();
		}
		order++;
		current=current.getNext();
	}
	return "not exist in habitat";
	
}
public void remove(String animal) {
	int order=animal.compareTo("m");
	if(order<0) {
		Node current=last;
		animal=animal.toLowerCase();
		while(current!=null) {
			if(current.getAnimal().getSpecies().equals(animal)) {
				if(current==last) {
					removeFromBack();
				}else  {
					current.getNext().setPrevious(current.getPrevious());
				current.getPrevious().setNext(current.getNext());
				
				}
			}
			current=current.getPrevious();
		}
	}else if(order>0) {
		Node current=first;
		animal=animal.toLowerCase();
		while(current!=null) {
			if(current.getAnimal().getSpecies().equals(animal)) {
				if(current==first) {
					removeFromFront();
				}else {
					current.getNext().setPrevious(current.getPrevious());
					current.getPrevious().setNext(current.getNext());
					
				}
			}
			current=current.getNext();
		}
	}
	System.out.println(animal.toUpperCase()+" IS DELETED FROM "+this.getHabitat());
}//end of remove

public boolean exist(String animal) {
	Node current=first;
	while(current!=null) {
		if(current.getAnimal().getSpecies().equals(animal.toLowerCase())) {
			return true;
		}
		current=current.getNext();
	}
	return false;
}




public int getLength() {
	return length;
}
public String getHabitat() {
	return habitat;
}
@Override
	public String toString() {
		return habitat;
	}




 
}
