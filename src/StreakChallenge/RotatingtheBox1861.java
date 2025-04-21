package StreakChallenge;

import java.util.Arrays;

public class RotatingtheBox1861 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char box[][] = {{'#','#','*','.','*','.'},{'#','#','#','*','.','.'},{'#','#','#','.','#','.'}};
		char ans[][]=rotateTheBox(box);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
			System.out.print(ans[i][j]);	
			}
			System.out.println();
			}
	}
	public static char[][] rotateTheBox(char[][] box) {
		int m=box.length;
		int n=box[0].length;
		char ans[][]=new char[n][m];
		for(char row[]:box) {
			int l=n-1;
			int r=n-1;
			while(l>=0) {
			if(row[l]=='#') {
				if(row[r]=='.') {
				char temp=row[l];
				row[l]=row[r];
				row[r]=temp;
				}
				l--;
				r--;
			}
			else if(row[l]=='*') {
				l--;
				r=l;
			}
			else l--;
		}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				ans[j][m-i-1]=box[i][j];
			}
		}
		return ans;
}
}