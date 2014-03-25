package com.albion.RPN;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

import org.testng.Assert;

/*
 *   
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */

/*
 * Note: does not handle invalid cases.  String convert to integer exceptions.
 * Solution utilize stack, put the last computed result back to stack. In the end, the size of stack should be one, didn't check corner cases.
 */
public class Solution {
	public int evalRPN(String[] tokens) {

		List<String> operators = Arrays.asList(new String[] { "+", "-", "*",
				"/" });

		Stack<Integer> stack = new Stack<Integer>();

		for (String token : tokens) {

			if (!operators.contains(token)) {
				int currentVal = Integer.parseInt(token);
				stack.push(currentVal);
			} else if (operators.contains(token)) {
				if (stack.size() >= 2) {
					int val1 = stack.pop();
					int val2 = stack.pop();
					int currentResult = compute(val2, val1, token);
					stack.push(currentResult);
				}
			}
		}

		return stack.pop().intValue();

	}

	int compute(int val1, int val2, String operator) {
		if ("+".equals(operator)) {
			return val1 + val2;
		} else if ("-".equals(operator)) {
			return val1 - val2;
		} else if ("*".equals(operator)) {
			return val1 * val2;
		} else {
			return val1 / val2;
		}

	}
}