package Array;

import java.util.ArrayList;

public class ArrayLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {16,17,4,3,5,2};
//int arr[]= {10,20,30,40};
int arr[]= {40,30,20,10};
int n=4;
ArrayList<Integer> list=leaders(n,arr);
for(int i=0;i<list.size();i++)
System.out.print(list.get(i)+" ");
	}
	 static ArrayList<Integer> leaders(int n, int arr[]) {
	        // Your code here
		 ArrayList<Integer> list=new ArrayList<>();
		 int max=0;
		 for(int i=n-1;i>=0;i--) {
			if(max<=arr[i]) {
				max=arr[i];
				 list.add(0, arr[i]);
			}
			
		 }
		 return list;
	    }
}
