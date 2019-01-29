package linkedList.learn;

public class LinkedListI {
	public Node head;
	public void addLast(int data){
		if(head==null){
			head = new Node(data);
		}
		else{
			Node current = head;
			while(current.next!=null){
				current = current.next;
			}
			current.next = new Node(data);
		}
	}
	public void addFirst(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data){
		if(head.data == data){
			head = head.next;
		}
		Node current = head;
		while(current.next!=null){
			if(current.next.data==data){
				current.next=current.next.next;
			}
			current = current.next;
		}
	}
	
	public void deleteFirst(int data){
		head = head.next;
	}
	
	public void addBetween(int data, int position){
		Node tempNode = new Node(data);
		for(int i=1; i<position;i++){
			tempNode = tempNode.next;
		}
		
		
	}
	
	
}
