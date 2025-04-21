package StreakChallenge;

public class CountUnguardedCellsintheGrid2257 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		int[][] guards = {{1,1}};
		int[][] walls = {{0,1},{1,0},{2,1},{1,2}};
		System.out.println(countUnguarded(m, n, guards, walls));
	}
public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
	int[][] ans=new int[m][n];
	for(int[] e:guards) {
		ans[e[0]][e[1]]=2;
	}
	for(int[] e:walls) {
		ans[e[0]][e[1]]=3;
	}
//	for(int[] e:guards) {
//		if(e[0]>0) {
//			int up=e[0]-1;
//			while(up>=0 && ans[up][e[1]]!=3) {
//				ans[up][e[1]]=1;
//				up--;
//			}
//		}
//		if(e[0]<m-1) {
//			int down=e[0]+1;
//			while(down<m && ans[down][e[1]]!=3) {
//				ans[down][e[1]]=1;
//				down++;
//			}
//		}
//		if(e[1]>0) {
//			int left=e[1]-1;
//			while(left>=0 && ans[e[0]][left]!=3) {
//				ans[e[0]][left]=1;
//				left--;
//			}
//		}
//		if(e[1]<n-1) {
//			int right=e[1]+1;
//			while(right<n && ans[e[0]][right]!=3) {
//				ans[e[0]][right]=1;
//				right++;
//			}
//		}
//   }
	
	//OR
	
	
//for(int[] e:guards) {
//		for(int i=e[0]-1;i>=0;i--) {
//			if(ans[i][e[1]]!=3)
//			ans[i][e[1]]=1;
//			else break;
//		}
//		for(int i=e[0]+1;i<m;i++) {
//			if(ans[i][e[1]]!=3)
//			ans[i][e[1]]=1;
//			else break;
//		}
//		for(int i=e[1]-1;i>=0;i--) {
//			if(ans[e[0]][i]!=3)
//			ans[e[0]][i]=1;
//			else break;
//		}
//		for(int i=e[1]+1;i<n;i++) {
//			if(ans[e[0]][i]!=3)
//			ans[e[0]][i]=1;
//			else break;
//		}
//        }
	
	for(int e[]:guards) {
		int[] dir= {-1,0,1,0,-1};
		for(int k=0;k<4;k++) {
			int x=e[0];
			int y=e[1];
			int dx=dir[k];
			int dy=dir[k+1];
			while(x+dx>=0 && x+dx<m && y+dx>=0 && y+dy<n && ans[x+dx][y+dy]<2) {
				x+=dx;
				y+=dy;
				ans[x][y]=1;
			}
		}
	}
	int c=0;
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(ans[i][j]==0)
				c++;
		}
	}
//	for(int i=0;i<m;i++) {
//		for(int j=0;j<n;j++) {
//			System.out.print(ans[i][j]+" ");
//		}
//		System.out.println();
//	}
	return c;
    }
}
