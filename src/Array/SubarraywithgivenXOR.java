package Array;

import java.util.HashMap;

public class SubarraywithgivenXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {4, 2, 2, 6, 4};
			int	 B = 6;
//		int A[] = {5,6,7,8,9};
//		int	 B = 5;
			System.out.println(solve(A,B));
	}
	 public static int solve(int[] A, int B) {
		 int c=0;
		 int xor=0;
		 HashMap<Integer,Integer> map=new HashMap<>();
		 map.put(0, 1);
		 for(int i:A) {
		 xor^=i;
		 if(map.containsKey(xor^B)) {
			 c += map.get(xor ^ B);
		 }
		 map.put(xor, map.getOrDefault(xor, 0) + 1);
		 }
		 return c;
	    }
}
