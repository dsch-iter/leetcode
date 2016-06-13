package com.albion.arrayrotate;

import java.util.Arrays;

public class ArrayRotate {
    public void rotate(int[] nums, int k) {
    	for (int i = 0; i < k; i++) {
    		for (int j = nums.length - 1; j > 0; j--) {
    			int temp = nums[j];
    			nums[j] = nums[j - 1];
    			nums[j - 1] = temp;
    		}
    	}
    }
    
    public void rotateV2(int[] nums, int k) {
    	int[] copy = Arrays.copyOf(nums, nums.length);
    	int length = nums.length;
    	for(int i = 0; i < length; i++) {
    		int index = ((i) + k) % length;
    		System.out.println("index: " + index);
    		nums[index] = copy[i];
    	}
    }
}
