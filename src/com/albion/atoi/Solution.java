package com.albion.atoi;

/*
 * 1235
 * 
 */
public class Solution {
	public int atoi(String str) {

		String input = str.trim();
//		if (input.charAt(0) == '+') {
//			input = input.substring(1, input.length() - 1);
//		}

		int base = 0;
		boolean isNegative = isNegative(str);
		int digit = digitCount(str);

		int startIndex = 0;

		if (isNegative) {
			startIndex = 1;
		}

		for (int i = startIndex; i < str.length(); i++) {
			int x = str.charAt(i) - '0';

			int y = -1;
			if (isNegative) {
				y = digit - i;
			} else {
				y = digit - i - 1;
			}

			int power10 = (int) Math.pow(10, y);
			x = power10 * x;
			base = base + x;
		}

		if (isNegative) {
			base = 0 - base;
		}
		if (base > Integer.MAX_VALUE) {
			base = Integer.MAX_VALUE;
		} else if (base < Integer.MIN_VALUE) {
			base = Integer.MIN_VALUE;
		}

		return base;
	}

	public boolean isNegative(String input) {
		boolean isNegative = false;
		char[] charInput = input.toCharArray();
		for (int i = 0; i < charInput.length; i++) {
			if (charInput[i] == '-') {
				if (isNegative == true) {
					// throw new NumberFormatException("bad!");
				} else {
					isNegative = true;
				}
			}
			// else if(charInput[i] == '+'){
			// isNegative = false;
			// break;
			// }
		}
		return isNegative;
	}

	public int digitCount(String input) {
		input = input.trim();
		char[] charInput = input.toCharArray();
		int digit = 0;

		for (int i = 0; i < charInput.length; i++) {
			if (charInput[i] == '-') {
				continue;
			} else if (charInput[i] == '+') {
				continue;
			} else {
				digit++;
			}
		}

		return digit;
	}
}
