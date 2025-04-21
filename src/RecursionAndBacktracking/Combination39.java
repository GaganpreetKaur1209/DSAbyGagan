package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Combination39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 7;
		System.out.println(combinationSum(candidates,target));
	}
public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	List<List<Integer>> list=new ArrayList<List<Integer>>();   
	List<Integer> ans=new ArrayList<>();
	sum(candidates, target,ans,0, list,0);
	 return list;
    }
public static void sum(int[] candidates, int target,List<Integer> ans,int sum, List<List<Integer>> list,int index) {
	if(sum==target) {
		list.add(new ArrayList<>(ans));
		return ;
	}
	else if(sum>target)
		return;
	for(int i=index;i<candidates.length;i++) {
		ans.add(candidates[i]);
		sum(candidates,target,ans,sum+candidates[i],list,i);
		ans.remove(ans.size()-1);
	}
}
}
