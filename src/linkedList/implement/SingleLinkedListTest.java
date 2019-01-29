package linkedlist.implement;

public class SingleLinkedListTest {

	public static void main(String[] args){
		SingleLinkedList l = new SingleLinkedList();
		l.add("10");
		l.addAtStart("30");
		l.addAtIndex(2, "20");
		l.addAtIndex(0, "40");
		l.removeAt(1);
		l.print();
		System.out.println("--->"+l.search("20"));
		l.print();
	}
}
