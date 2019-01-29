package programs;

import linkedlist.learn.Node;

public class Add1 {

	private Node head;
	private static int counter=0;
	
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
	
	public void add1(int num){
		Node current = head;
		Node before = null;
		Node after = null;
		while(current!=null){
			after = current.getNext();
			current.setNext(before);
			before = current;
			current = after;
			
		}
		head = after;
	}
	
	
}
