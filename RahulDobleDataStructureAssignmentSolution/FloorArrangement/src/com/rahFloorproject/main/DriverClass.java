package com.rahFloorproject.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import com.rahFloorproject.service.FloorPlacement;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// Enter the total no of floors in the building
		// and assign it to floorNum
		System.out.println("Enter the total no of floors in the building: ");
		int floorNum = sc.nextInt();

		// initially max is largest floor size
		// then it will decrement by 1
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<>();
		// enter the floor size given on day : in queue by loop
		for (int i = 0; i < floorNum; i++) {

			System.out.println("Enter the floor size given on day : " + (i + 1));
			queue.add(sc.nextInt());
		}

		FloorPlacement obj = new FloorPlacement();
		obj.floorPlacement(queue, floorNum, stack);

		System.out.println();
	}
}
