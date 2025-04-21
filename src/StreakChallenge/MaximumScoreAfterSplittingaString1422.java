package StreakChallenge;

public class MaximumScoreAfterSplittingaString1422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="00111";
		System.out.println(maxScore(s));
	}
public static int maxScore(String s) {
//	int[] sum=new int[s.length()];
//	sum[0]=s.charAt(0)-'0';
//	for(int i=1;i<s.length();i++) {
//		sum[i]=sum[i-1]+s.charAt(i)-'0';
//	}  
//	int ans=0;
//	int i=0;
//    int count=0;
//	int check;
//	int max=0;
//	while(i<s.length()-1) {
//		check=s.charAt(i)-'0'==0?++count:count;
//		max=sum[s.length()-1]-sum[i]+check;
//		System.out.println(max);
//		ans=Math.max(ans, max);
//		i++;
//	}
//	return ans;
	
	int ans=0;
	int zero=0;
	int one=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='1')
			one++;
	}
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)=='1')
			one--;
		else
			zero++;
		ans=Math.max(ans, zero+one);
	}
	return ans;
    }
}
