package StreakChallenge;

import java.util.Arrays;

public class PartitionArrayAccordingtoGivenPivot2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,12,5,10,14,3,10};
		int pivot = 10;
		System.out.println(Arrays.toString(pivotArray(nums,pivot)));
	}
	  public static int[] pivotArray(int[] nums, int pivot) {
	        int lessthan=0;
	        int equal=0;
	        for(int l=0;l<nums.length;l++){
	            if(nums[l]<pivot)
	            lessthan++;
	            else if(nums[l]==pivot)
	            equal++;
	        }
	        int i=0;
	        int j=lessthan;
	        int k=lessthan+equal;
	        int arr[]=new int[nums.length];
	         for(int l=0;l<nums.length;l++){
	            if(nums[l]<pivot){
	                arr[i]=nums[l];
	                i++;
	            }
	           else if(nums[l]>pivot){
	                arr[k]=nums[l];
	                k++;
	            }
	            else{
	                arr[j]=nums[l];
	                j++;
	            }
	            }
	         return arr;
	    }
	}