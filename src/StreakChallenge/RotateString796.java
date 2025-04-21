package StreakChallenge;

public class RotateString796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "abcde";
	String goal = "cdeab";
	System.out.println(rotateString(s,goal));
	}
	public static boolean rotateString(String s, String goal) {
      if(s.length()!=goal.length())
    	  return false;
      String str=s+s;
      if(!str.contains(goal))
    	  return false;
      return true;
    }
}
