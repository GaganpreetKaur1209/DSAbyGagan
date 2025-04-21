package StreakChallenge;

public class MovePiecestoObtainaString2337 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String start = "_L__R__R_";
		String target = "L______RR";
		System.out.println(canChange(start,target));
	}
	 public static boolean canChange(String start, String target) {
		 if(start.equals(target))
			 return true;
	 
		 int left=0;
		 int right=0;
		 for (int i = 0; i < start.length(); i++) {
	            char curr = start.charAt(i);
	            char goal = target.charAt(i);
	            if(curr=='R') {
	            	if(left>0)
	            		return false;
	            right++;
	            }
	            if(goal=='L') {
	            	if(right>0)
	            		return false;
	            left++;
	            }
	            if(goal=='R') {
	            	if(right==0)
	            		return false;
	            right--;
	            }
	            if(curr=='L') {
	            	if(left==0)
	            		return false;
	            left--;
	            }
		 } 
		 return left==0 && right==0;
	 }
}
