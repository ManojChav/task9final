package com.bellinfo.task9final;

public class elementrep {

	public static void main(String[] args) {
		int ary[] = {1,2,2,3,5,3,6,4,2,3,1,2,3,7,5,3,3,3,3,6,9,7,4,6,4,5};
		int count[]=new int[ary.length];
		for(int i=0;i<ary.length;i++){
			for(int j=i;j<ary.length;j++){
				if(ary[i]==ary[j])
					count[i]++;
			}
		}
		int repelm =0; 
		int n=0;
		for(int i=0;i<count.length;i++){
			if(count[i]>repelm){
				repelm = count[i]; 
				n=i;
			}
		}
			System.out.println(ary[n]+" repeated "+ repelm+" times");  
	}
}
