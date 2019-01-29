package programs;

public class BreakingRecords {

	static int[] breakingRecords(int[] arr) {
        int min=0;
        int minValue=0;
        int max=0;
        int maxValue=0;
        for(int i=0;i<arr.length-1;i++){
        	if(i==0){
            	maxValue=arr[i];
            }
        	
            if(arr[i+1]>arr[i]&&arr[i+1]>maxValue){
                maxValue=arr[i+1];
                max++;
            }
            if(i==0){
            	minValue=arr[i];
            }
        	
        	
           if(arr[i+1]<arr[i]&&arr[i+1]<minValue){
                minValue=arr[i+1];
                min++;
            }
        }     
        

        int a[] ={max,min};
        return a;

    }
	
	public static void main(String[] args){
		int arr[] = {100,45,41,60,17,41,45,43,100,40,89,92,34,6,64,7,37,81,32,50};
		int a[] =breakingRecords(arr);
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
		
	}
}
