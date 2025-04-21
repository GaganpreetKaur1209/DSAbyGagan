package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class AllOccurencesQues9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,7,3,8};
		System.out.println(alloccurence(arr,0,3));
	}
	public static List<Integer> alloccurence(int arr[],int index,int target){
		List<Integer> list=new ArrayList<>();
		if(index==arr.length)
			return list;
		if(arr[index]==target)
			list.add(index);
		 list.addAll(alloccurence(arr,index+1,target));
		 return list;
	}

}
