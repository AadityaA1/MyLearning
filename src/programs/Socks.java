package programs;

import java.util.Arrays;

public class Socks {

		static int countingValleys(int n, String s) {
	        
	        char[] ch = s.toCharArray();
	        Arrays.sort(ch);
	        int levels=0;
	        int valleys=0;
	       
	        for(int i=0; i<ch.length;i++){
	            if(ch[i]=='U'){
	                levels++;
	            }
	            if(ch[i]=='D'){
	                levels--;
	            }

	            if(levels<0){
	                valleys++;
	            }

	           
	        }

	        return valleys;


	    }
	
	public static void main(String[] args){
		String text = "UDDDUDUU";
		System.out.println(countingValleys(8, text));
	}
}
