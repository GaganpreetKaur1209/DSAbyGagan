package BucketSort;

import java.util.Arrays;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,8,20,7,16,18,12,1,23,11};
		System.out.println(Arrays.toString(sort(arr)));
	}
	public static int[] sort(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		int[] bucket=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			bucket[arr[i]]++;
		}
		int j=0;
		for(int i=0;i<=max;i++) {
			while(bucket[i]>0) {
				arr[j]=i;
				bucket[i]--;
				j++;
			}
		}
		return arr;
	}

}
