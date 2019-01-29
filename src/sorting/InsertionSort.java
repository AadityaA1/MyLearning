package sorting;

public class InsertionSort {

	public static void insertionSort(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			int value=arr[i];
			int hole=i;
			while(hole>=1&&arr[hole-1]>value){
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=value;
		}
	}
	
	public static void main(String[] args){
		int arr[]={6,4,1,2,3};
		insertionSort(arr);
		for(int j=0 ; j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
}
