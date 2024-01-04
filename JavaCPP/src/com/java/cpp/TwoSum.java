package com.java.cpp;


import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the size of the list ");
		int n = sc.nextInt();
		int [] nums = new int[n];
		
		for(int i=0; i<n; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Write the target ");
		int target = sc.nextInt();
		
		sc.close();
		
		int[] output = twoSum(nums, target);
		System.out.println(output[0]+" " +output[1]);		
		
	}

	private static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
		for(int i=0; i<nums.length; i++)
		{
			int remain = target - nums[i];
			if(hm.containsKey(remain))
			{
				return new int[] {i, hm.get(remain)};
			}
			else
			{
				hm.put(nums[i], i);
				
			}
			
			
		}
		return null;
	}

}
