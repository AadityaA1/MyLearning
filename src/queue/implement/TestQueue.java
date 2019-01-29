package queue.implement;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplement q = new QueueImplement();
		
		q.enQueue("10");
		q.enQueue("20");
		q.enQueue("30");
		q.enQueue("40");
		q.deQueue();
		q.enQueue("50");
		q.enQueue("60");
		q.show();
	}

}
