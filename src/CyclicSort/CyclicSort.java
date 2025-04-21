package CyclicSort;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,5,2,1,4};
System.out.println(Arrays.toString(cyclicSort(arr)));
	}
	public static int[] cyclicSort(int arr[]) {
		int i=0;
//		while(i<arr.length) {		
//		if(arr[i]!=i+1) 
//			{
//			int temp=arr[i];
//			arr[i]=arr[temp-1];
//			arr[temp-1]=temp;
//		}
//		else
//			i++;
//	}
		while(i<arr.length) {	
			int index=arr[i]-1;
			if(arr[i]!=i+1) 
				{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
			else
				i++;
		}
		return arr;
	}
}
