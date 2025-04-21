package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class DiceThrowQuesUsingList33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(possibilities(4,""));
	}
	public static List<String> possibilities( int target, String ans){
		if(target==0) {
			List<String> list=new ArrayList<>();
			list.add(ans);
			return list;
		}
		List<String> output=new ArrayList<>();
		for(int i=1;i<=6 && i<=target;i++) {
		output.addAll(possibilities(target-i,ans+i));
		}
		return output;
	}

}
