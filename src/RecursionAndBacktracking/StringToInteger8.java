package RecursionAndBacktracking;

public class StringToInteger8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="      -042";
		System.out.println(myAtoi(s));
	}
	 public static int myAtoi(String s) {
	        int i=0;
	        int n=s.length();
	        int sign=1;
	        long result=0;
	        int max = Integer.MAX_VALUE; //2147483647
	        int	min = Integer.MIN_VALUE; //-2147483648;
	        while(i<n && s.charAt(i)==' ')
	        	i++;
	        if(i<n && (s.charAt(i)=='-'||s.charAt(i)=='+'))
	        	{
	        	sign=s.charAt(i)=='-'?-1:1;
	        	i++;
	        	}
	        while(i<n && Character.isDigit(s.charAt(i))) {
	        	int digit=s.charAt(i)-'0';
	        	result=result*10+digit;
	        	if(sign==-1 && -1*result<min) return min;
	        	if(sign==1 && result>max) return max;
	        	i++;
	        }
	        return (int)(sign*result);
	    }
}
