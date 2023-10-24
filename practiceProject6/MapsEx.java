package practiceProject6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapsEx {

	public static void main(String[] args) {

		//Hash map
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		hm.put(1,"Ram");    
		hm.put(2,"Shyam");    
		hm.put(3,"Hari");   

		System.out.println("\nThe elements of Hashmap are ");  
		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		
		//Hash Table
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Rajib");  
	      ht.put(5,"Siba");  
	      ht.put(6,"Kabuli");  
	      ht.put(7,"Sibu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> tm=new TreeMap<Integer,String>();    
	      tm.put(8,"Happy");    
	      tm.put(9,"Sonu");    
	      tm.put(10,"Bimal");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:tm.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    



	}

}
