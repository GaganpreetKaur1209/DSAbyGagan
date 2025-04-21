package BinarySearch;

public class MedianOfTwoSortedArrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,4,7,10,12};
		int arr2[]= {2,3,6,5};
		System.out.println(findMedianSortedArrays(arr1,arr2));
	}
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int index1=n/2;
        int ind1=0;
        int index2=n/2-1;
        int ind2=0;
        int i=0;
        int j=0;
        while(i<n1 && j<n2) {
        	if(nums1[i]<=nums2[j]) {
        		if(count==index1)
        			ind1=nums1[i];
        		if(count==index2)
        			ind2=nums1[i];
        		count++;
        		i++;        			
        	}
        	else
        	{
        		if(count==index1)
        			ind1=nums2[j];
        		if(count==index2)
        			ind2=nums2[j];
        		count++;
        		j++;        			
        	}
        }
        while(i<n1) {
        	if(count==index1)
    			ind1=nums1[i];
    		if(count==index2)
    			ind2=nums1[i];
    		count++;
    		i++;  
        }
        while(j<n2) {
        	if(count==index1)
    			ind1=nums2[j];
    		if(count==index2)
    			ind2=nums2[j];
    		count++;
    		j++;  
        }
        if(n%2==1)
        	return ind2;
        return (double)(ind1+ind2)/2.0;
    }

}
