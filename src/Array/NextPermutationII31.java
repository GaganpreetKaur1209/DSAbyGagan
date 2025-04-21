package Array;

import java.util.Arrays;

public class NextPermutationII31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {1,2,3};
int arr[]= {3,2,1};
//int arr[]= {1,3,2};
//int arr[]= {1,1};
nextPermutation(arr);
for(int i:arr) {
	System.out.print(i+" ");
}
	}
public static void nextPermutation(int[] nums) {
	 int i=nums.length-2;
		int j=nums.length-1;
int index1=0;
int n =nums.length-1;
boolean swap=false;
while(i>=0) {
	if(nums[i]<nums[i+1]) {
		index1=i;
		break;
	}
	i--;
}
while(j>=0) {
	if(nums[index1]<nums[j]) {
		int temp=nums[index1];
		nums[index1]=nums[j];
		nums[j]=temp;
		swap=true;
     break;
	}
	j--;
}
int index=index1+1;
if(swap) {
	while(index<n) {
		int temp=nums[index];
		nums[index]=nums[n];
		nums[n]=temp;
		index++;
		n--;
	}
}
else {
	while(index1<n) {
		int temp=nums[index1];
		nums[index1]=nums[n];
		nums[n]=temp;
		index1++;
		n--;
	}
}

 }
}