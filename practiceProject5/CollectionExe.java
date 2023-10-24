package practiceProject5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionExe {

	public static void main(String[] args) {

		//creating Array list
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();   
		name.add("Debashis");
		name.add("Khilar");
		name.add("Java");    	   
		System.out.println(name+"\n");  
		
		//creating vector
		System.out.println("Vector");
		Vector<Integer> vect = new Vector();
		vect.addElement(110); 
		vect.addElement(220);
		vect.addElement(19); 
		System.out.println(vect+"\n");
		
		//creating Linkedlist
		System.out.println("LinkedList");
	      LinkedList<String> course=new LinkedList<String>();  
	      course.add("Java");  
	      course.add("Python"); 
	      course.add("SQL");
	      System.out.println(course); 
	       
	       //creating hashset
	       System.out.println("\nHashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(102);  
	       set.add(103);
	       set.add(104);
	       System.out.println(set+"\n");
	       
	       //creating linkedhashset
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(1);  
	       set2.add(2);  
	       set2.add(3);
	       set2.add(4);	       
	       System.out.println(set2);



	}

}
