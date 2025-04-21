package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class DiceThrowQues32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		possibilities(4,"");
	}
	public static void possibilities( int target, String ans){
		if(target==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=6 && i<=target;i++) {
		possibilities(target-i,ans+i);
		}
	}

}
