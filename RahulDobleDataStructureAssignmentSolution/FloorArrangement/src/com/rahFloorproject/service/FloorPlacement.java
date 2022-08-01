package com.rahFloorproject.service;

import java.util.Queue;
import java.util.Stack;

public class FloorPlacement extends StackSortMethod {

	public void floorPlacement(Queue<Integer> queue, int floorNum, Stack<Integer> stack) {

		int max = floorNum;
		System.out.println();
		// The order of construction is as follows
		// if floor size is not match with maximum floor size
		// then store it in stack
		System.out.println("The order of construction is as follows: ");

		for (int i = 0; i < floorNum; i++) {
			System.out.println();
			System.out.println("Day: " + (i + 1));
			int removed = queue.remove(); // remove floor size from queue and compare it with max
			// if match found place(print) it
			// if match not found store in stack

			while (removed != max) {
				if (stack.isEmpty()) {
					stack.push(removed);
					break;

				} else {
					pushData(removed, stack);
					// store in stack in descending order
				}
				break;
			}
			while (removed == max) {
				System.out.print(removed + " ");
				max--;
				// (!stack.isEmpty)
				while ((!stack.isEmpty()) && stack.peek() == max) {
					System.out.print(stack.pop() + " ");
					max--; // decrement max floor size by 1
				}
			}
		}
	}
}