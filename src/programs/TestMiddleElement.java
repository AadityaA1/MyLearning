package programs;

public class TestMiddleElement {

	public static void main(String[] args){
		MiddleOfLinkedList l = new MiddleOfLinkedList();
		l.add("10");
		l.add("20");
		l.add("30");
		l.add("40");
		l.add("50");
		l.add("50");
		l.add("60");
		l.add("60");
		l.add("60");
		System.out.println(l.printMiddle());
		l.removeDuplicates();
		l.printList();
	}
}
