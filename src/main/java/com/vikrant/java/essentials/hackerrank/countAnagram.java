package com.vikrant.java.essentials.hackerrank;


import java.util.HashMap;
import java.util.Map;

public class countAnagram {
	
	public static void main(String args[])
	{
		System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
	}
	
	public static int makeAnagram(String a, String b) {
	    // Write your code here
	       char arr[] = a.toCharArray();
	       char arr1[] = b.toCharArray();
	       int count =0;
	       Map<Character,Integer> amap = countFrequency(arr);
	       Map<Character,Integer> bmap = countFrequency(arr1);
	       
	      for(char ch:amap.keySet())
	      {
	    	  if(bmap.containsKey(ch))
	    	  {
	    		 count=count+(amap.get(ch)<bmap.get(ch)?amap.get(ch):bmap.get(ch));
	    	  }
	      }
	       return (a.length()-count)+(b.length()-count);
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
