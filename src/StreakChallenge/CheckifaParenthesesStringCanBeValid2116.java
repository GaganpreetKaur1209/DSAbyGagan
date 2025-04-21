package StreakChallenge;

public class CheckifaParenthesesStringCanBeValid2116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "))()))";
		 String locked = "010100";
		 System.out.println(canBeValid(s,locked));
	}
	 public static boolean canBeValid(String s, String locked) {
	        if(s.length()%2!=0)
	        return false;
	        int wc=0;
	        int op=0;
	        int cl=0;
	        for(int i=0;i<s.length();i++){
	            if(locked.charAt(i)=='0')
	            wc++;
	            else{
	                if(s.charAt(i)==')')
	                cl++;
	                else
	                op++;
	            }
	            if(wc+op<cl)
	            return false;
	        }
	        int w=0;
	        int o=0;
	        int c=0;
	         for(int i=s.length()-1;i>=0;i--){
	            if(locked.charAt(i)=='0')
	            w++;
	            else{
	                if(s.charAt(i)==')')
	                c++;
	                else
	                o++;
	            }
	            if(w+c<o)
	            return false;
	        }
	        return true;
	    }
	}