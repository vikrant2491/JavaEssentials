package com.vikrant.java.essentials.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class TwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Vivek";
		String s2 = "Vikrant";
		String s3 = "Nshant";
		System.out.println(twoStrings(s1,s2));
		System.out.println(twoStrings(s1,s3));

	}
	
	public static String twoStrings(String s1, String s2) {
	    // Write your code here
	    
	    char ch[] = s1.toCharArray();
	    char ch1[] = s2.toCharArray();
	    String st = "";
	    
	    Map<Character,Integer> hmaps2 = countFrequency(ch1);
	    
	    for(char ele:ch)
	    {
	        if(hmaps2.containsKey(ele))
	        {
	         return "YES";
	        }
	        else
	        st = "NO";
	    }
	       return st;
	    
	    }
	    
	    public static Map<Character,Integer> countFrequency(char[] ch)
	    {
	        Map<Character,Integer> hmap = new HashMap<Character,Integer>();
	        
	        for(char element:ch)
	        {
	            if(hmap.containsKey(element))
	            hmap.put(element,hmap.get(element)+1);
	            else
	            hmap.put(element,1);
	        }
	        return hmap;
	    }

}
