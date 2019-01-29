package arraylist.implement;

public class TestArrayList {

	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
		al.remove(0);
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
	}
}
