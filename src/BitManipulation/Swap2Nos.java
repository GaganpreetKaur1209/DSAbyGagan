package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class Swap2Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=8;
		System.out.print(get(a,b));
	}
	 static List<Integer> get(int a,int b)
	    {
	        // code here
		 List<Integer> ans=new ArrayList<>();
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 ans.add(a);
		 ans.add(b);
		 return ans;
	    }
}
