package com.test;

import java.util.HashSet;

public class longestconsq {
	public static int longestconcecutive(int[] nums) {
		if(nums==null || nums.length==0) {
			return 0;
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int num:nums) {
			hs.add(num);
		}
		int longestseq = 0;
		for(int num:hs) {
		if(!hs.contains(num-1)) {
			int currentseq=1;
			int currentnum=num;
		while(hs.contains(currentnum+1)){
			currentnum++;
			currentseq++;
		}
		longestseq = Math.max(longestseq, currentseq);
		}
		}
		return longestseq;
	}

	public static void main(String[] args) {
		int[] arr = {100,4,200,1,3,2};
		System.out.println(longestconsq.longestconcecutive(arr));

	}

}
