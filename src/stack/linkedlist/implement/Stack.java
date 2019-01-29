package stack.linkedlist.implement;

public class Stack {

	
	Node top = null;
	
	public void push(Object data){
		Node n = new Node(data);
		n.next = top;
		top = n;
	}
	
	public void pop(){
		top=top.next;
	}
	
	public void show(){
		Node current = top;
		while(current!=null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
}
