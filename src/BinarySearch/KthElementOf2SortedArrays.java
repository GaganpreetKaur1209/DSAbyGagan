package BinarySearch;

public class KthElementOf2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {100, 112, 256, 349, 770};
		int arr2[]= {72, 86, 113, 119, 265, 445, 892};
		int k=7;
		System.out.println(kthElement(k,arr1, arr2));
	}
	 public static long kthElement(int k, int arr1[], int arr2[]) {
	        int count=0;
	        int n1=arr1.length;
	        int n2=arr2.length;
	        int n=n1+n2;
	        int i=0;
	        int j=0;
	        int ans=-1;
	        if(k>n)
	        	return -1;
	        while(i<n1 && j<n2) {
	        	if(arr1[i]<=arr2[j])
	        	{
	        		count++;
	        		if(count==k)
	        			return arr1[i];
	        		i++;
	        	}
	        	else
	        	{
	        		count++;
	        		if(count==k)
	        			return arr2[j];
	        		j++;
	        	}
	        }
	        while(i<n1) {
	        	count++;
        		if(count==k)
        			return arr1[i];
        		i++;
	        }
	        while(j<n2) {
	        	count++;
        		if(count==k)
        			return arr2[j];
        		j++;
	        }
	        return ans;
	    }

}
