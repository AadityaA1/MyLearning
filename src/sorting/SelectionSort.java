package sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int iMin = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[iMin]){
					iMin = j;
				}
				int temp = arr[iMin];
				arr[iMin] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String[] args){
		int arr[] = {5,3,2,6,1};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}
