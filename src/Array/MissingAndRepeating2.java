package Array;

import java.util.Arrays;

public class MissingAndRepeating2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int arr[] = {2, 2};
		System.out.println(Arrays.toString(findTwoElement(arr,n)));
	}
	public static int[] findTwoElement(int arr[], int n) {
        // code here
		int repeating=-1;
		int missing=-1;
		int result[]=new int[2];
		boolean count[]=new boolean[n+1];
		for(int i=0;i<=n;i++) {
			count[i]=false;
		}
		for(int i=0;i<n;i++) {
			if(count[arr[i]]==true) {
				repeating=arr[i];
			}
			else
			count[arr[i]]=true;
		}
		for(int i=0;i<=n;i++) {
		 if(count[i]==false) {
			missing=i;
		}
	}
		result[0]=repeating;
		result[1]=missing;
		return result;
		}

}
