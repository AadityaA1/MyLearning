package doublelinkedlist.implement;

public class DoubleLinkedList {

	private Node head;
	
	public void addAtStart(Object data){
		Node newNode = new Node(data);
		
		newNode.prev=null;
		newNode.next = head;
		head = newNode;
		
		
	}
	
	public void addAfter(Node prev_Node,Object data){
		Node newNode  = new Node(data);
		
		prev_Node.next = newNode;
		newNode.next = prev_Node.next;
		newNode.prev = prev_Node;
		if(newNode.next!= null){
			 prev_Node.next.prev=newNode.next;
		}
		
		
	}
	
	public void addAtEnd(Object data){
		Node newNode = new Node(data);
		Node current = head;
		while(current!=null){
			current=current.next;
		}
		
		current.next=newNode;
		newNode.prev = current;
		newNode.next = null;
	}
	
	public void addBefore(Node nextNode, Object data){
		Node newNode = new Node(data);
		
		
		
		nextNode.prev = newNode;
		newNode.next = nextNode;
		
	}
}
