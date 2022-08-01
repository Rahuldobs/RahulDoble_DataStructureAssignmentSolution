package com.rahFloorproject.service;

import java.util.Stack;

public class StackSortMethod {

	// always place maximum value at top of the stack
	//by recursion method
	public static void pushData(int data, Stack<Integer> stack) {

		if (stack.isEmpty() || stack.peek() < data) {
			stack.push(data);
			return;
		}

		int top = stack.pop();
		pushData(data, stack);
		stack.push(top);

	}
}
