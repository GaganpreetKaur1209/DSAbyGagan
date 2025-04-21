package StreakChallenge;

public class ConstructStringWithRepeatLimit2182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zyzyzyxyxyxyxwxwxwxvxvxuxututststsrsrsrqrqrpopopopopopopononmnmlklkljljljijijijhghghghghfhfefefdfdfcfcbababababab";
		int repeatLimit = 2;
		System.out.println(repeatLimitedString(s, repeatLimit));
	}
public static String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder ans=new StringBuilder();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++) {
        	arr[s.charAt(i)-97]++;
        }
        for(int i=arr.length-1;i>=0;i--) {
        	int c=0;
        	while(arr[i]>0 && c<repeatLimit) {
        		ans.append((char)(i+97));
        		c++;
        		arr[i]--;
        		if(c==repeatLimit && arr[i]>0) {
        			int pointer=i-1;
        				while(pointer>=0 && arr[pointer]==0) {
            				pointer--;
        				}
        				if(pointer<0)
        					break;
        				ans.append((char)('a'+pointer));
        				arr[pointer]--;
        				c=0;
        		}
        	}
        }
        return ans.toString();
    }
}
