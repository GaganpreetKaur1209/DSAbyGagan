package RecursionAndBacktracking;

public class NQueenQues41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean board[][]=new boolean[n][n];
		System.out.println(queen(board,0));
	}

	private static int queen(boolean[][] board, int r) {
		if(r==board.length) {
			display(board);
			return 1;
		}
		int count=0;
		for(int col=0;col<board.length;col++) {
			if(ifSafe(board,r,col)){
				board[r][col]=true;
				count+=queen(board,r+1);
				board[r][col]=false;
			}
		}
	return count;	
	}

	private static boolean ifSafe(boolean[][] board, int r, int col) {
		for(int i=0;i<r;i++) {
			if(board[i][col])
				return false;
		}
		int maxLeft=Math.min(r, col);
		for(int i=1;i<=maxLeft;i++) {
			if(board[r-i][col-i])
				return false;
		}
		int maxRight=Math.min(r, board.length-col-1);
		for(int i=1;i<=maxRight;i++) {
			if(board[r-i][col+i])
				return false;
		}
		return true;
	}

	private static void display(boolean[][] board) {
		for(boolean[] row:board) {
			for(boolean col:row) {
				if(col)
					System.out.print("X");
				else
					System.out.print("Q");
			}
			System.out.println();
		}
		System.out.println();
	}

}
