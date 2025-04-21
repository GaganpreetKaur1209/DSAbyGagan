package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIII216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 7;
		System.out.println(combinationSum3(k,n));
	}
	 public static List<List<Integer>> combinationSum3(int k, int n) {
		 List<List<Integer>> list=new ArrayList<>();
	        List<Integer> ans=new ArrayList<>();
	        combination(k,n,list,ans,0,1);
	        return list;
	            }
	            public static void combination(int k, int n, List<List<Integer>> list, List<Integer> ans, int sum, int num){
	                if(ans.size()==k && sum==n){
	                    list.add(new ArrayList<>(ans));
	                    return;
	                }
	                 if(ans.size()==k || sum>n || num>=10)
	                return;
	                ans.add(num);
	                sum+=num;
	                combination(k, n, list, ans, sum, num+1);
	                ans.remove(ans.size()-1);
	                sum-=num;
	                combination(k, n, list, ans, sum, num+1);
	            }
	}