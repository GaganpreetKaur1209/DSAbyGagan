package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators282 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "232";
		int target = 8;
		System.out.println(addOperators(num,target));
	}
	 public static List<String> addOperators(String num, int target) {
	        List<String> list=new ArrayList<>();
	        if(num==null || num.length()==0)
	        return list;
	        operations(list,"", num, target, 0,0, 0);
	        return list;
	    }
	    public static void operations(List<String> list,String ans, String num, int target,int index,  long res,  long prevno){
	        if(index==num.length() && res==target)
	        list.add(ans);
	        else if(index==num.length())
	        return;
	        for(int i=index;i<num.length();i++){
	            if(i!=index && num.charAt(index)=='0')
	            break;
	            long currNo=Long.parseLong(num.substring(index, i+1));
	            if(index==0)
	            operations(list, ans+currNo, num, target, i+1, currNo, currNo);
	            else{
	                 operations(list, ans+"+"+currNo, num, target,  i+1, res+currNo,  currNo);
	                 operations(list, ans+"-"+currNo, num, target,  i+1, res-currNo,  -currNo);
	                 operations(list, ans+"*"+currNo, num, target,  i+1, res-prevno+prevno*currNo, prevno*currNo);
	            }
	        }
	    }
	}