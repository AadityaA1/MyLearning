package linkedlist.learn;

public class LinkedList {


	private Node head;
	private static int counter;
	
	public void add(Object data){
		Node temp = new Node(data);
		Node current = head;
		if(current==null){
			current=temp;
		}else{
			while(current.getNext()!=null){
				current = current.getNext();
			}
			current.setNext(temp);
			counter++;
		}
	}
	
	public void remove(int index){
		Node current = head;
		for(int i=0;i<index;i++){
			current = current.getNext();
		}
		
			current.setNext(current.getNext().getNext());
			counter--;
	}
	
	public void addAtIndex(Object data, int index){
		Node temp = new Node(data);
		Node current = head;
		for(int i=0;i<index;i++){
			current = current.getNext();
		}
		
		temp.setNext(current.getNext());
		current.setNext(temp);
		counter++;
	}
	
	public Object get(int index){
		Node current = head;
		for(int i=0;i<index;i++){
			current=current.getNext();
		}
		return current.getData();
	}

}
