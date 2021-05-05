package com.vikrant.java.essentials.hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static long countTriplets(List<Long> arr, long r) {
        long count =0;
         for(int i=0;i<arr.size();i++)
         {
       long a = arr.get(i);
       for(int j=i+1;j<arr.size();j++)
       {
        if((a*r)==(arr.get(j)))
        {
          for(int k=j+1;k<arr.size();k++)
           {
             if((a*r*r)==(arr.get(k)))
             {
               count++;  
             }
           }
       }
         }
         }
         return count;
 }

}
