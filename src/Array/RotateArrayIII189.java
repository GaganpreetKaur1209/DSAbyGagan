package Array;

public class RotateArrayIII189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,7};
int k=3;
rotate(arr,k);
for(int i=0;i<arr.length;i++) {
System.out.print(arr[i]+" ");
}
	}
	 public static void rotate(int[] nums, int k) {
		 k=k%nums.length;
		 swap(nums,0,nums.length-1);
		 swap(nums,0,k-1);
		 swap(nums,k,nums.length-1);
	        
	    }
	 public static void swap(int nums[], int start, int end) {
		 while(start<end) {
			 int temp=nums[start];
			 nums[start]=nums[end];
			 nums[end]=temp;
			 start++;
			 end--;
		 }
	 }

}
