package com.app.sortedlinkedlist;

public class Tester {

	public static void main(String[] args) {
		SortedSinglyLinkedList l = new SortedSinglyLinkedList();
		l.addElement(1000);
		l.addElement(5000);
		l.addElement(200);
		l.addElement(1000000);
		l.addElement(5000);
		l.addElement(200);
		l.addElement(1000);
		l.addElement(1000000);
		
		l.printList();
	}
	
}
