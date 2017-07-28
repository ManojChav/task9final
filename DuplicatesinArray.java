package com.bellinfo.task9final;

import java.util.ArrayList;

public class DuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = {1,2,2,3,5,3,6,4,2,3,1,2,3,7,5,3,3,3,3,6,9,7,4,3,3,5};
		int count[]=new int[ary.length];
		for(int i=0;i<ary.length;i++){
			for(int j=i;j<ary.length;j++){
				if(ary[i]==ary[j])
					count[i]++;
			}
		}
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0;i<ary.length;i++)
			if(count[i]>2)
				if(!(a.contains(ary[i])))
					a.add(ary[i]);
		
		
		for(Integer i:a)
			System.out.println("Element "+i+" has more than one duplicates");
		
		
	
	}

}
