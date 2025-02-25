package com.demo;

import java.util.HashSet;

public class longestSeq {
	public static int longestConsecutiveSeq(int[] nums) {
		if(nums==null || nums.length==0) {
			return 0;
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int num:nums) {
			hs.add(num);
		}
		
		int longestSeq=0;
		for(int num:hs) {
			if(!hs.contains(num-1)) {
				int currentnum=num;
				int currentseq=1;
				
				while(hs.contains(currentnum+1)) {
					currentnum++;
					currentseq++;
				}
				
				longestSeq = Math.max(longestSeq, currentseq);
			}
			
			
		}
		return longestSeq;
		
	}

	public static void main(String[] args) {
		int[] arr = {100,4,200,1,3,2};
		System.out.println(longestSeq.longestConsecutiveSeq(arr));
	}

}
