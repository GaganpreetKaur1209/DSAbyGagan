package Strings;

public class LongestHappyString1405Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		int c=7;
		System.out.println(longestDiverseString(a,b,c));
	}
public static String longestDiverseString(int a, int b, int c) {
        int totalLength=a+b+c;
        int countA=0;
        int countB=0;
        int countC=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<totalLength;i++) {
        	if((a>=b && a>=c && countA!=2)||(countB==2 && a>0)||(countC==2 && a>0)) {
        		sb.append("a");
        		a--;
        		countA++;
        		countB=0;
                countC=0;
        }
        	else if((b>=c && b>=a && countB!=2)||(countA==2 && b>0)||(countC==2 && b>0)) {
        		sb.append("b");
        		b--;
        		countB++;
        		countA=0;
                countC=0;
        }
        	else if((c>=b && c>=a && countC!=2)||(countB==2 && c>0)||(countA==2 && c>0)) {
        		sb.append("c");
        		c--;
        		countC++;
        		countB=0;
                countA=0;
        }
        }
        	return sb.toString();
    }
}
