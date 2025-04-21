package StreakChallenge;
public class MaximumSwap670Day11 {

    public static void main(String[] args) {
        int num = 99901;
  //2736, 9973
        System.out.println(maximumSwap(num));
    }

    public static int maximumSwap(int num) {
    	 char n[]=Integer.toString(num).toCharArray();
 		int index=0;
         int max=0;
 		for(int i=1;i<n.length;i++) {
             if(n[i-1]==n[i]  && index==0 )
                 continue;
 			else if((n[i-1]<=n[i] && n[i]>=max )) {
 				max=n[i];
 				index=i;
 			}
 		}
 		if(index>0) {
 			for(int i=0;i<index;i++) {
 				if(n[i]<max) {
 					int temp=n[index];
 					n[index]=n[i];
 					n[i]=(char) temp;
                     return Integer.parseInt(new String(n));
 				}
 			}
             
 		}
 		return num;
 		}
}
