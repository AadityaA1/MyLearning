package programs;

import java.util.ArrayList;

public class RepeatingCharacters {

	public void findRepeatingCharacters(String text){
		char[] c = text.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[j]==c[i]){
					System.out.println(c[j]);
				}
			}
		}
	}
	
	public static void reverse(String text){
		char[] c = text.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		reverse("texter");
		maxRepeat("texterxtffffssss");
		maxConsecutiveRepeat("textfffe");
	}
	
	public static void maxRepeat(String text){
		ArrayList<Character> maxRepeat = new ArrayList();
		int maxCount=0;
		
		char[] c = text.toCharArray();
		for(int i=0;i<c.length;i++){
			int itemCount=0;
			for(int j=i+1;j<c.length;j++){
				if(c[j]==c[i]){
					itemCount++;
				}
			}
			if(maxCount<itemCount){
				maxRepeat.removeAll(maxRepeat);
				maxCount = itemCount;
				maxRepeat.add(c[i]);
			}else if(maxCount==itemCount){
				maxRepeat.add(c[i]);
			}
		}
		System.out.println(maxRepeat);
	}
	
	public static void maxConsecutiveRepeat(String text){
		ArrayList<Character> maxRepeat = new ArrayList<>();
		int maxCount=0;
		
		char[] c = text.toCharArray();
		for(int i=0;i<c.length;i++){
			int itemCount=0;
			for(int j=i+1;j<c.length;j++){
				if(c[j]==c[i]){
					itemCount++;
				}else{
					break;
				}
			}
			if(maxCount<=itemCount){
				maxCount = itemCount;
				maxRepeat.add(c[i]);
			}
			
		}
		System.out.println(maxRepeat);
	}
}
