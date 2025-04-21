package Array;

public class ReversePairs493 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,3,2,3,1};
System.out.println(reversePairs(nums));
	}
	 public static int reversePairs(int[] nums) {
	        int start=0;
	        int end=nums.length-1;
	        merge(start,end, nums);
	        int c=0;
	        int j=0;
	        for(int i=nums.length-1;i>=0;i--) {
	        	if( nums[i]>2*nums[j])
	        		c++;
	        }
	        return c;
	    }
	 public static void merge(int start,int end,int[] nums) {
		 if(start>=end)
			 return;
		 int mid=start+(end-start)/2;
		 merge(start,mid,nums);
		 merge(mid+1,end,nums);
	        mergeSort(nums, start, mid,end);
	 }
	 public static void mergeSort(int nums[], int start, int mid, int end) {
		int i=start;
		int j=mid+1;
		int mergeSort[]=new int[end-start+1];
		int c=0;
		while(i<=mid && j<=end)
		{
			if(nums[i]<=nums[j]) {
				mergeSort[c]=nums[i];
				c++;
				i++;
			}
			else {
				mergeSort[c]=nums[j];
				c++;
				j++;
			}
		}
		while(i<=mid) {
			mergeSort[c]=nums[i];
			c++;
			i++;
		}
		while(j<=end) {
			mergeSort[c]=nums[j];
			c++;
			j++;
		}
		for(int len=0,length=start;len<mergeSort.length;len++,length++) {
			nums[length]=mergeSort[len];
		}
	 }

}
