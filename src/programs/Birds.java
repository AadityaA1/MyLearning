package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Birds {

	
		 static int migratoryBirds(List<Integer> arr) {
		        int count=0;
		        int total =0;
		        int value = 0;
		        Collections.sort(arr);
		        for(int i=0;i<arr.size();i++){
		            for(int j=1;j<arr.size();j++){
		                if(arr.get(i)==arr.get(j)){
		                    count = count + 1;
		                    value = arr.get(i);
		                }
		                else{
		                    i++;
		                   
		                }
		            }
		            if(count>total){
		                total=value;
		            }
		        }
		        return total;

		    }
		 public static void main(String[] args){
			 
			 List<Integer> list = new ArrayList<>();
			 list.add(1);
			 list.add(2);
			 list.add(2);
			 list.add(3);
			 list.add(3);
			 migratoryBirds(list);
			 
			 
	}
}
