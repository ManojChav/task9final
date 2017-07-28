package com.bellinfo.task9final;

import java.util.Map;
import java.util.TreeMap;

public class stringrep {

	public static void main(String[] args) {
		Map<Character, Integer> map = new TreeMap<Character, Integer>(); 
		char temp;
		String s = "Peter piper picked a peck of pickled peppers";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			temp = s.charAt(i);
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					count++;
			}
			map.put(temp, count);
//			if (count > 1)
//				System.out.println(s.charAt(i) + " repeated " + count + " number of times.");
//			s = s.replaceAll(s.substring(i, i + 1), "");
			
		}
		for(java.util.Map.Entry<Character, Integer> c:map.entrySet()){
			if(c.getValue()>2){
				System.out.println(c.getKey()+ " repeated " + c.getValue()+ " number of times.");
			}
			
		}
	}
}
