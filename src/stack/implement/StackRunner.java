package stack.implement;

public class StackRunner {

	public static void main(String[] args){
		StackImplement s = new StackImplement();
		s.push("10");
		s.push("20");
		s.push("30");
		s.pop();
		s.pop();
		s.pop();
		s.show();
		
	}
}
