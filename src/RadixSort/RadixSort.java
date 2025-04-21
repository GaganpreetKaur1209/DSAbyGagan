package RadixSort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {181,289,390,121,145,736,514,212};
System.out.println(Arrays.toString(sorting(arr)));
	}
	public static int[] sorting(int arr[]) {
		int max=arr[0];
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		while(max>0) {
			max=max/10;
			c++;
		}
		int output[]=new int[arr.length];
		//int j=0;
		for(int i=0,j=0;i<arr.length;i++,j++) {
			output[j]=arr[i]%(int)(Math.pow(10, c));
		//	j++;
		}
		return arr;
	}

}
