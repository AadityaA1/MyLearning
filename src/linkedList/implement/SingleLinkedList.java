package linkedlist.implement;

import linkedlist.implement.Node;

public class SingleLinkedList {

	private Node head;
	private int counter = 0;

	public void add(Object data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
		counter++;
	}

	public void removeAt(int index) {
		
		if(index==0){
			head = head.next;
		}
		else{
		Node current = head;
		if (current != null) {
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
			counter--;
		}
		}
	}

	public void addAtStart(Object data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
		counter++;
	}

	public void print() {
		Node current = head;
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}

	public void addAtIndex(int index, Object data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (index == 0) {
			addAtStart(data);
		} else {

			Node current = head;
			if (current != null) {
				for (int i = 0; i < index - 1; i++) {
					current = current.next;
				}
				newNode.next = current.next;
				current.next = newNode;

			}
		}
	}
	
	public void reverse(){
		if(head!=null){
			Node prevNode = head;
			head = head.next;
			Node current = head;
			prevNode.next = null;
			while(head!=null){
				head = head.next;
				current.next = prevNode;
				prevNode = current;
				current = head;
			}
			prevNode = head;
		}
		
	}
	
	public int search(Object element){
		Node current = head;
		int index =0;
		while(current!=null){
			if(current.data.equals(element)){
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}

}
