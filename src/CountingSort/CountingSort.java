package CountingSort;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {2,9,7,4,1,8,4};
		int arr[]= {11, 30, 24, 7, 31, 16, 39, 41};
		System.out.println(Arrays.toString(sorting(arr)));
	}
public static int[] sorting(int arr[]) {
	int max=arr[0];
	//int sum=0;
	for(int i=1;i<arr.length;i++) {
		if(max<arr[i])
			max=arr[i];
	}
	int[] count=new int[max+1];
	for(int i=0;i<arr.length;i++) {
		count[arr[i]]++;
	}
	for(int i=1;i<count.length;i++) {
	count[i]=count[i]+count[i-1];
	}
//	for(int i=1;i<count.length;i++) {
//		int counts=count[i];
//		while(counts>count[i-1]) {
//			arr[counts-1]=i;
//			counts--;
//		}
//	}
	
	for(int i=count.length-1;i>0;i--) {
		while(count[i]>count[i-1]) {
		arr[count[i]-1]=i;
		count[i]--;
	}
	}
	return arr;
}
}
