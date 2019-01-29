package queue.implement;

public class QueueImplement {

	final int MAX = 5;
	Object[] queue = new Object[MAX];
	int front;
	int rear;
	int size;

	public void enQueue(Object data) {
		if (size == MAX) {
			throw new IllegalStateException("Queue is full");
		} else {
			queue[rear] = data;
			size = size + 1;
			rear = (rear + 1)%MAX;
		}
	}

	public void deQueue(){
		size = size-1;
		queue[front] = Integer.MIN_VALUE;
		front = (front+1)%MAX;
	}
	
	public void show(){
		Object result=null;
		for(int i=0;i<size;i++){
			result=result + queue[(front+i)%MAX].toString();
			if(i<size-1){
				result+=" , ";
			}
		}
		
		System.out.println(result);
		
		
	}
}
