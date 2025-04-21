package StreakChallenge;

public class CountTotalNumberofColoredCells2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coloredCells(3));
	}
	 public static long coloredCells(int n) {
	        if(n==1)
	        return 1;
	        return (long) 4 * (n - 1) + coloredCells(n - 1);
	    }
	}
