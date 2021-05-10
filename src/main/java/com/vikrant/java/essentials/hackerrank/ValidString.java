package com.vikrant.java.essentials.hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidString {
	public static void main(String[] args){
		String s = "abcdefghhgfedecba";
		System.out.println(isValid(s));
		long s1 =0;
		int n=5;
		int z =4;
		double sum =0.0;
		sum = sum + ((double) 5) /2;
		System.out.println(sum);
		s1=(long) (n+sum);
		System.out.println(s1);
	}
	
	public static String isValid(String s) {

    // Write your code here
        char ch[] = s.toCharArray();
        Map<Character, Integer> smap = countFrequency(ch);
        Collection<Integer> collectionValues = smap.values();
        List<Integer> svalues = new ArrayList<>(collectionValues);
        List<Integer> dupValues = new ArrayList<>();
        String result = "YES";

        for (int i = 1; i < svalues.size(); i++) {
            
                if (!(svalues.get(0).equals(svalues.get(i))))
                dupValues.add(svalues.get(i));
            }
        
        if (dupValues.size() > 1)
            result = "NO";
        if (dupValues.size() == 1) {
            int op=dupValues.get(0)>svalues.get(0)?dupValues.get(0):svalues.get(0);
            int op1=dupValues.get(0)>svalues.get(0)?svalues.get(0):dupValues.get(0);
            if(op1-1==0)
                result = "YES";
            else if(op-1!=op1)
                result = "NO";
            
        }

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
