package com.bellinfo.task9final;

import java.util.Scanner;

public class stockexchange {

	public static void main(String[] args) {
		/*int ary[] = new int[30];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the stock values for 30 days");*/
		int ary[] = {23,45,67,78,99,90,78,67,99,23,100,23,34,56,7,8,90,1,67,88,23,12,34,56,78,98,76,33,44,2};
		/*for (int n = 1; n < 30; n++) {
			ary[n] = s.nextInt();
		}*/

		for (int n = 1; n < 30; n++) {

		}
		int maxprof = 0;
		int buy = 1, sell = 1;
		String maxgain = null;
		for (int i = 0; i < ary.length; i++) {
			for (int j = i+1; j < ary.length; j++) {
				if (ary[j] - ary[i] > maxprof) {
					maxprof = ary[j] - ary[i];

					buy = i+1;
					sell = j+1 ;
					maxgain = "(" + Integer.toString(ary[j]) + " - "+ Integer.toString(ary[i]) + " = "
				+ Integer.toString(ary[j] - ary[i]) + ")";
		
				}
				
			}
			
		}
		
		System.out.println("profit tip");
		System.out.println("Buy your shares on day " + buy
				+ " and sell your shares on " + sell);
		System.out.println("you could gain a maximum profit up to " + maxgain);

	}
}
