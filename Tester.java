package com.app.sortedlinkedlist;

import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			SortedSinglyLinkedList sortedSinglyLinkedList = new SortedSinglyLinkedList();

			boolean exit = false;
			
			while(!exit) {
				System.out.println("1. Enter data into sorted manner in singly linked list");
				System.out.println("2. Print List");
				System.out.println("3. Exit");
				
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the number");
					sortedSinglyLinkedList.addElement(sc.nextInt());
					break;

				case 2:
					System.out.println("*******LIST********");
					sortedSinglyLinkedList.printList();
					break;
					
				case 3:
					System.out.println("BYE!!");
					exit = true;
					break;
					
				default:
					break;
				}
				
			}
			
//			System.out.println("Enter the element");
			
			
			/*
			 * sortedSinglyLinkedList.addElement(1000);
			 * sortedSinglyLinkedList.addElement(5000);
			 * sortedSinglyLinkedList.addElement(200);
			 * sortedSinglyLinkedList.addElement(1000000);
			 * sortedSinglyLinkedList.addElement(5000);
			 * sortedSinglyLinkedList.addElement(200);
			 * sortedSinglyLinkedList.addElement(1000);
			 * sortedSinglyLinkedList.addElement(1000000);
			 */

			
		}
	}

}
