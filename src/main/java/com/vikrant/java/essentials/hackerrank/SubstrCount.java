package com.vikrant.java.essentials.hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SubstrCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\Chetali\\JavaEssentials\\input2.txt"))));
		String s = bufferedReader.readLine();
     System.out.println(substrCount(727310,s));
	}
	static long substrCount(int n, String s) {
        char ch [] = s.toCharArray();
        
        double sum =0.0;
        long result=0;
         Map<Character, Integer> smap = countFrequency(ch);
          
                for(Character c:smap.keySet())
                {
                	int fac =1;
                    if(smap.get(c)>1)
                    {
                    	  for(int i=(n-1);i>0;i--)
                          {
                              fac = fac*i;
                          }
                        
                      }
                    result=result+fac;   
                    }
                result=(long) (n+result); 
            return result;
            
   }
   
   public static Map<Character, Integer> countFrequency(char[] ch) {
       Map<Character, Integer> hmap = new HashMap<Character, Integer>();

       for (char element : ch) {
           if (hmap.containsKey(element))
               hmap.put(element, hmap.get(element) + 1);
           else
               hmap.put(element, 1);
       }
       return hmap;
   }

}
