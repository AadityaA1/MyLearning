package programs;

import linkedlist.learn.Node;

public class MiddleOfLinkedList {

	private static int counter = 0;
	private Node head;

	public int countOfElements() {
		return counter;
	}

	public Object printMiddle() {
		Node current = head;
		int numberOfElements = countOfElements();
		int middleElement = numberOfElements / 2;
		for (int i = 0; i <= middleElement; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		}
		Node temp = new Node(data);
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);

		counter++;
	}

	public void removeDuplicates() {
		Node current = head;
		if (current != null) {
			while (current.getNext() != null) {
				if (current.getData() == current.getNext().getData()) {
					current.setNext(current.getNext().getNext());
					counter--;
				}else{
					current = current.getNext();
				}
			}
		}
		
	}

	public void printList() {
		String output = "";

		if (head != null) {
			Node current = head;
			while (current != null) {
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}

		}
		System.out.println(output);
	}
}
