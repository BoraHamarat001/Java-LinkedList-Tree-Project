package LİnkedList;


import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static LinkedList water=new LinkedList("WATER");
	static LinkedList land=new LinkedList("LAND");
	static LinkedList air=new LinkedList("AIR");
	
	public static void main(String[] args) {
       /*Animals a1=new Animals("water", "seal", "penguin", 17, -24,3, 7, "seal is an a beautiful animal");
       Node n1=new Node(a1);
       LinkedList list1=new LinkedList("water");
       list1.insert(a1);
       list1.outputBackward();
       System.out.println();
       list1.addToFront(new Animals("water", "killer whale", "penguin,seal", 21, -41, -12, 4, "killer whale is a type of whale"));
       list1.outputForward();
       list1.outputBackward();
       list1.addToBack(new Animals("water", "shark", "human", 27, 2, 12, 5,"shark is an dreadful animal"));
       list1.outputForward();
       list1.outputBackward();
       System.out.println(list1.getLength());*/
	    /* water.addToFront(new Animals("water", "shark", "human", 27, 2, 12, 5,"shark is an dreadful animal"));
	     water.addToFront(new Animals("water", "killer whale", "penguin,seal", 21, -41, -12, 4, "killer whale is a type of whale"));
	     water.addToBack(new Animals("water", "seal", "penguin", 17, -24,3, 7, "seal is an a beautiful animal"));
	     water.removeFromBack();
	     System.out.println(water.search("killer whale"));
	     water.outputForward();*/
		water.insert(new Animals("water", "shark", "human", 27, 2, 12, 5,"shark is an dreadful animal"));
	     water.insert(new Animals("water", "killer whale", "penguin,seal", 21, -41, -12, 4, "killer whale is a type of whale"));
	     water.insert(new Animals("water", "seal", "penguin", 17, -24,3, 7, "seal is an a beautiful animal"));
	     water.insert(new Animals("water", "crocodile", "gazelle", 9, 23, 37, 3, "crocodile is reptile"));
	     
	     land.insert(new Animals("land", "elephant", "plant,reptile,fruit",32, 14,43, 6, "elephant is a mammal."));
	    land.insert(new Animals("land", "lion", "antelope,zebra,gazelle", 24, 17, 45, 5,"The lion is one of the big cats in the genus Panthera." ));
	    land.insert(new Animals("land", "wolf", "deer,goat,rabbit", 11, -32, 26, 3, "wolf is a large mammal of the genus Canis, native to Eurasia and North America."));
	    
	    air.insert(new Animals("air", "eagle", "worm,snake,fly bird", 7,0, 20, 2, "eagle is a member of the family of hawks (Accipitridae)"));
	    air.insert(new Animals("air", "owl", "small mammals", 3.5, 22, 24, 1, "owl is the general name given to the nocturnal raptor species of the Strigiformes order"));
	    air.insert(new Animals("air", "stork", "insects, fish, amphibians, reptiles", 5, 11.5, 32, 11, "stork is a large and long-legged bird from the stork family (Ciconiidae)."));
	    
	    System.out.print("WATER:");
	    water.outputForward();
	    System.out.print("\nLAND:");
	    land.outputForward();
	    System.out.print("\nAIR:");
	    air.outputForward();
	    
	    
	    
	    
	    
	    
		boolean goOn=true;
		while(goOn) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("\nENTER 1 TO ADD ANIMAL"+"\nENTER 2 TO REMOVE ANIMAL"+"\nENTER 3 TO SEARCH ANIMAL"+"\nENTER 4 TO PRINT HABITAT"+"\nENTER 5 TO QUIT");
		int command=sc1.nextInt();
		if(command==5) goOn=false;
		if(command==1) {
		Scanner sc=new Scanner(System.in);
		System.out.println("HABITAT:");
		String hbt=sc.nextLine();
		System.out.println("SPECIES:");
		String spcs=sc.nextLine();
		System.out.println("NUTRITION:");
		String ntrt=sc.nextLine();
		System.out.println("LIFE TIME:");
		double lftm=sc.nextInt();
		System.out.println("MIN TEMP:");
		double mintemp=sc.nextInt();
		System.out.println("MAX TEMP:");
		double maxtemp=sc.nextInt();
		System.out.println("PIECE");
		int piece=sc.nextInt();
		System.out.println("HISTORY:");
		String history=sc.next();
		
		System.out.println("FRONT:PRESS 1 OR BACK:PRESS 2");
		int side=sc.nextInt();
		System.out.println(side);
		if(side==1) {
			System.out.println("ANIMAL ADDED FRONT");
		switch (hbt.toUpperCase()) {
		case "WATER":water.addToFront(new Animals(hbt,spcs, ntrt, lftm, mintemp, maxtemp, piece, history)); break;
		case "LAND":land.addToFront(new Animals(hbt,spcs, ntrt, lftm, mintemp, maxtemp, piece, history)); break;
		case "AİR":air.addToFront(new Animals(hbt,spcs, ntrt, lftm, mintemp, maxtemp, piece, history)); break;
	}
		}else if(side==2) {
			System.out.println("ANIMAL ADDED BACK");
			switch (hbt.toUpperCase()) {
			case "WATER":water.addToBack(new Animals(hbt,spcs, ntrt, lftm, mintemp, maxtemp, piece, history)); break;
			case "LAND":land.addToBack(new Animals(hbt,spcs, ntrt, lftm, mintemp, maxtemp, piece, history)); break;
			case "AİR":air.addToBack(new Animals(hbt,spcs, ntrt, lftm, mintemp, maxtemp, piece, history)); break;
			}
		}
		water.outputForward();
	
	}else if(command==2) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of animal");
		String animal=sc.nextLine();
		System.out.println("Enter habitat of animal");
		String habitat=sc.nextLine().toUpperCase();
		switch(habitat.toUpperCase()) {
		case "WATER": if(water.exist(animal)) water.remove(animal); else System.out.println("ANIMAL IS NOT EXIST IN WATER!"); break;
		case "LAND": if(land.exist(animal)) land.remove(animal); else System.out.println("ANIMAL IS NOT EXIST IN LAND!"); break;
		case "AİR": if(air.exist(animal)) air.remove(animal); else System.out.println("ANIMAL IS NOT EXIST IN AIR!"); break;
		}
	}//END OF 2
	else if(command==3) {//START OF 3
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AN ANIMAL NAME");
		String animal=sc.nextLine();
		System.out.println("ENTER HABITAT OF ANIMAL");
		String habitat=sc.nextLine();
		
		switch(habitat.toUpperCase()) {
		case "WATER": if(water.exist(animal)) water.search(animal); else System.out.println("ANIMAL IS NOT EXIST IN WATER!"); break;
		case "LAND": if(land.exist(animal)) land.search(animal); else System.out.println("ANIMAL IS NOT EXIST IN LAND!"); break;
		case "AİR": if(air.exist(animal)) air.search(animal); else System.out.println("ANIMAL IS NOT EXIST IN AIR!"); break;
		default: System.out.println("HABITAT IS NOT EXIST");
		}
			
	  
	}//END OF 3
	else if(command==4) {//START OF 4
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER HABITAT NAME");
		String habitat=sc.nextLine();
		System.out.println("FRONT:PRESS 1 OR BACK:PRESS 2");
		int side=sc.nextInt();
		if(side==1) {
		switch(habitat.toUpperCase()) {
		case "WATER": water.outputForward(); break;
		case "LAND": land.outputForward();  break;
		case "AİR": air.outputForward();  break;
		default: System.out.println("ENTER AN APPROPIATE HABITAT!");
		}
	}else if(side==2) {
		switch(habitat.toUpperCase()) {
		case "WATER": water.outputBackward(); break;
		case "LAND": land.outputBackward(); break;
		case "AİR": air.outputBackward(); break;
		default: System.out.println("ENTER AN APPROPIATE HABITAT!");
	 }
	}
	else {
		if(habitat.toLowerCase()!="WATER" && habitat.toLowerCase()!="LAND" && habitat.toLowerCase()!="AİR") {
			System.out.println("ENTER AN APPROPIATE SIDE VALUE AND HABITAT!");
		}else {
		System.out.println("ENTER AN APPROPIATE SIDE VALUE!");
		}
	}
  }//END OF 4
	else {
		System.out.println("ENTER AN APPROPIATE REQUEST!");
	}
		
		
		
  
		
	}	
  }
}
	
	

