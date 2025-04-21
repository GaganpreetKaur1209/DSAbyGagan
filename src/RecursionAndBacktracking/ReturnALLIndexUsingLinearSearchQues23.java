package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class ReturnALLIndexUsingLinearSearchQues23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,7,4,7,5,6};
		List<Integer> list=new ArrayList<>();
		System.out.println(search(arr,7,0,list));
	}
	public static List<Integer> search(int arr[], int target,int index,List<Integer> list) {
	 if(index==arr.length)
			return list;
	 else if(arr[index]==target)
		 list.add(index);
	return  search(arr,target,index+1,list);
		
	}
}
