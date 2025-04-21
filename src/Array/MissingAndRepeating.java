package Array;

import java.util.Arrays;

public class MissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int arr[] = {2, 2};
		System.out.println(Arrays.toString(findTwoElement(arr,n)));
	}
	public static int[] findTwoElement(int arr[], int n) {
        // code here
		int result[]=new int[n+1];
		int ans[]=new int[2];
		int repeating=-1;
		int missing=-1;
		for(int i=1;i<=n;i++) {
			result[i]=0;
		}
		for(int i=0;i<n;i++) {
			result[arr[i]]++;
		}
		for(int i=1;i<=n;i++) {
		if(result[i]==2)
			repeating=i;
		else if(result[i]==0)
			missing=i;
		if(repeating!=-1 && missing!=-1)
			break;
		}
		ans[0]=repeating;
		ans[1]=missing;
			return ans;
	}

}
