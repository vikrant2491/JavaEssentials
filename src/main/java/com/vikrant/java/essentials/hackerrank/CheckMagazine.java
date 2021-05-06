package com.vikrant.java.essentials.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckMagazine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        List<String> note = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        checkMagazine(magazine, note);

        bufferedReader.close();
    }
	
	public static void checkMagazine(List<String> magazine, List<String> note) {
	    // Write your code here
	       Map<String,Integer> magazineMap = countFrequency(magazine);
	       Map<String,Integer> noteMap = countFrequency(note);
	       List<String> result = new ArrayList<String>();
	       for(String ele:note)
	       {
	           if(magazineMap.containsKey(ele))
	           {
	               if(magazineMap.get(ele)>=noteMap.get(ele))
	               result.add("Yes");
	               else
	               result.add("No");
	              
	           }
	           else
	           result.add("No");
	       }
	         if(result.contains("No"))
	         System.out.println("No");
	         else
	         System.out.println("Yes");
	    }
	    
	    public static Map<String,Integer> countFrequency(List<String> alist)
	        {
	            Map<String,Integer> hmap = new HashMap<String,Integer>();
	            
	            for(String element:alist)
	            {
	                if(hmap.containsKey(element))
	                hmap.put(element,hmap.get(element)+1);
	                else
	                hmap.put(element,1);
	            }
	            return hmap;
	        }

	}

}
