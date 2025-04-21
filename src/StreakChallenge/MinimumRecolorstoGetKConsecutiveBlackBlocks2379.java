package StreakChallenge;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks2379 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  blocks = "WBBWWBBWBW";
		int k = 7;
		System.out.println(minimumRecolors(blocks,k));
	}
	 public static int minimumRecolors(String blocks, int k) {
         int ans=Integer.MAX_VALUE;
          for(int i=0;i<=blocks.length()-k;i++){
              int white=0;
              for(int j=i;j<i+k;j++){
                  if(blocks.charAt(j)=='W')
                     white++;
              }
             ans=Math.min(white,ans); 
         }
         return ans;
      }
  }
