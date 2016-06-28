package com.albion.missing;

public class MissingNumber {
	
	//0, 1, 2, 3 ... N
    public int missingNumber(int[] nums) {
      int result = -1;
      
      int size = nums.length;
      if(size == 1){
    	  return nums[0] +1;
      }
      for(int i = 0; i < nums.length - 1; i++){
    	  result = nums[i+1] - nums[i];
    	  if(result != 1){
    		  return result;
    	  }
      }
      return result;
    }
}
