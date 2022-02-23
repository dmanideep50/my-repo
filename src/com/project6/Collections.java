package com.project6;
import java.util.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Collections {

	public static void main(String args[]) {
	System.out.println("ArrayList");
	ArrayList<String> city=new ArrayList<String>();   
      city.add("Madanapalli");
      city.add("Kalakada");    	   
      System.out.println(city);  

	//creating vector
      System.out.println("\n");
      System.out.println("Vector");
      Vector<Integer> vec = new Vector<Integer>();
      vec.addElement(10); 
      vec.addElement(40); 
      System.out.println(vec);
	
	//creating linkedlist
      System.out.println("\n");
      System.out.println("LinkedList");
      LinkedList<String> names=new LinkedList<String>();  
      names.add("Giridhar");  
      names.add("Naveen");  	      
      Iterator<String> itr=names.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
       
       //creating hashset
       System.out.println("\n");
       System.out.println("HashSet");
       HashSet<Integer> set=new HashSet<Integer>();  
       set.add(80);  
       set.add(90);  
       set.add(85);
       set.add(99);
       System.out.println(set);
       
       //creating linkedhashset
       System.out.println("\n");
       System.out.println("LinkedHashSet");
       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
       set2.add(18);  
       set2.add(17);  
       set2.add(32);
       set2.add(24);	       
       System.out.println(set2);
      	} 
      }  
}
