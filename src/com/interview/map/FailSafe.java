package com.interview.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.omg.CORBA.Current;

public class FailSafe {

	public static void main(String[] args) {   
      
		Map<String, Integer> m = new ConcurrentHashMap<String,Integer>();   
        m.put("ONE", 1); //Adding values  
        m.put("SEVEN", 7);   
        m.put("FIVE", 5);   
        m.put("EIGHT", 8);   
        
        Set<String> s=m.keySet();
        Iterator<String> it=s.iterator();
       // Iterator it = m.keySet().iterator();   
        while (it.hasNext()) {   
            String key = it.next();   
            System.out.println(key + " : " + m.get(key));   
            // This will reflect in iterator.   
            // This means it has not created separate copy of objects  
           m.put("NINE", 9);  
        System.out.println(key + " : " + m.get(key));
        }   
    }   
}  

