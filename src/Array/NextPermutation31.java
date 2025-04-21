package Array;

import java.util.Arrays;

public class NextPermutation31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {1,2,3};
//int arr[]= {3,2,1};
//int arr[]= {1,3,2};
int arr[]= {1,1};
nextPermutation(arr);
for(int i:arr) {
	System.out.print(i+" ");
}
	}
public static void nextPermutation(int[] nums) {
	int i=nums.length-2;
	while( i>=0 && nums[i]>=nums[i+1]) {
		i--;
	}
	if(i>=0) {
		int j=nums.length-1;
		while(nums[i]>=nums[j]) {
			j--;
		}
		swap(nums, i, j);
	}
		reverse(nums, i+1,nums.length-1);
		
}
	public static void swap(int arr[], int i , int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	public static void reverse(int arr[], int i , int j) {
		while(i<j) {
		swap(arr,i,j);
		i++;
		j--;
		}
	}
}
