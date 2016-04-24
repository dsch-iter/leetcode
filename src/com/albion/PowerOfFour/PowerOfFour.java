package com.albion.PowerOfFour;

import java.math.BigInteger;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
    	
    	Integer x = new Integer(num);
    	String input = x.toBinaryString(x);
    	if(num == 0){
    		return false;
    	}else if(num == 1){
    		return true;
    	}
    	if(input.toCharArray().length % 2 == 0){
    		return false;
    	} else {
    		String copy = new String(input);
    		String y = copy.replace("0", "");
    		return y.equals("1");
    	}
    }
}