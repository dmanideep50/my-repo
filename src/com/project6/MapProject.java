package com.project6;
import java.util.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
public class MapProject {

	public static void main(String[] args) {
		//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"kiran");    
			      hm.put(2,"mahesh");    
			      hm.put(3,"naveen");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"reddy");  
			      ht.put(5,"badri");  
			      ht.put(6,"vinod");    

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"tarun");    
			      map.put(9,"raj");    
			      map.put(10,"ramudu");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }
	}
}

