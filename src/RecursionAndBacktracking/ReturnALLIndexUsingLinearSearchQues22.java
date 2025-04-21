package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class ReturnALLIndexUsingLinearSearchQues22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,7,4,7,5,6};
		System.out.println(search(arr,7,0));
	}
	public static List<Integer> search(int arr[], int target,int index) {
		List<Integer> list=new ArrayList<>();
	 if(index==arr.length)
			return list;
	 else if(arr[index]==target)
		 list.add(index);
	 List<Integer> list2=search(arr,target,index+1);
	 list.addAll(list2);
	  return list;
		
	}
}
