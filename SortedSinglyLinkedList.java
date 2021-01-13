package com.app.sortedlinkedlist;

public class SortedSinglyLinkedList {

	private ListNode headNode;

	public SortedSinglyLinkedList() {
		headNode = null;
	}

	public class ListNode {
		int data;
		ListNode next;
	}

	public void addElement(int num) {
		ListNode newNode = new ListNode();//create a new node
		newNode.data = num;//assign num to new nodes data
		newNode.next = null;//assign next to null, if its last element or only element in list, then next remains null
		
		//first node
		if(headNode == null) {
			headNode = newNode;
			return;
		}
		else {
			ListNode previousNode = null; //make previous null, it should be always behind current
			ListNode currentNode = headNode;//make head the current node(which will be our first node)
			
			while(currentNode != null && currentNode.data < newNode.data) {
				//traverse the list to get the previous and current node. the loop will either end at last meaning the node 
				//has the highest num and has to be inserted at end, or the loop will end in between where in it fails the 
				//second condition and the node has to be inserted between the previous and current node
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			
			if(previousNode != null) {
				//if previous is not null meaning the node has to be inserted between current node and previous node
				newNode.next = currentNode;//new nodes next is null, which will now point to current node
				previousNode.next = newNode;//previous nodes next was pointing to current node, changing it to point the new node
			}
			else {
				//if previous is null, that means the node has to be inserted at the first place
				previousNode = newNode;//previous becomes new node
				headNode = previousNode;//head node now becomes the previous node which is the first node now
				headNode.next = currentNode;//head nodes next points to current node which becomes the second node here
			}

		}
		
	}

	/*
	 * b) Print all elements stored in the list.
	 */
	public void printList() {

		ListNode currentNode = headNode;

		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

}
