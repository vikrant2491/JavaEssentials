package com.vikrant.essentials.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountTriplets {

	public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\BYO\\JavaWorkspace\\JavaEssentials\\input.txt"))));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(nr[0]);
//
//        long r = Long.parseLong(nr[1]);

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr.add(arrItem);
        }

        long ans = countTriplets(arr, 10);
        System.out.println(ans);

//        bufferedWriter.write(String.valueOf(ans));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
	}
	
	static long countTriplets(List<Long> arr, long r) {
		Map<Long, Long> elements = new HashMap<Long, Long>();
		long count=0;
		for(Long elem: arr){
			if(elements.containsKey(elem)){
				elements.put(elem, elements.get(elem)+1);
			}else{
				elements.put(elem, (long)1);
			}
		}
		elements.put((long)1237, (long)100000);
		
		Iterator<Long> itr = elements.keySet().iterator();
		while(itr.hasNext()){
			Long a = itr.next();
			if(r==1){
				count += ((elements.get(a))*(elements.get(a)-1)*(elements.get(a)-2))/6;
			}else if(elements.containsKey(a*r) && elements.containsKey(a*r*r)){				
				count += elements.get(a)*elements.get(a*r)*elements.get(a*r*r);
			}
		}
		return count;
	}

}
