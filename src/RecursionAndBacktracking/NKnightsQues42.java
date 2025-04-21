package RecursionAndBacktracking;

public class NKnightsQues42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean board[][]=new boolean[n][n];
		knight(board,0,0,4);
	}
	public static void knight(boolean board[][],int row,int col,int knights) {
		if(knights==0) {
			display(board,row,col);
			return;
		}
		if(row==board.length-1 && col==board.length)
			return;
		if(col==board.length) {
			knight(board,row+1,0,knights);
			return;
		}
		if(isSafe(board,row,col)) {
			board[row][col]=true;
			knight(board,row,col+1,knights-1);
			board[row][col]=false;
		}
		knight(board,row,col+1,knights);
	}
	private static boolean isSafe(boolean[][] board, int row, int col) {
		if(isValid(board,row-2,col-1)) {
			if(board[row][col])
				return false;
		}
		if(isValid(board,row-2,col+1)) {
			if(board[row][col])
				return false;
		}
		if(isValid(board,row-1,col-2)) {
			if(board[row][col])
				return false;
		}
		if(isValid(board,row-1,col+2)) {
			if(board[row][col])
				return false;
		}
		return true;
	}
	private static boolean isValid(boolean b[][],int row,int col) {
		if(row>=0 && row<b.length && col>=0 && col<b.length)
		return true;
		return false;
	}
	private static void display(boolean[][] board,int row,int col) {
		for(boolean r[]:board) {
			for(boolean c:r) {
				if(c)
					System.out.print("K");
				else
					System.out.print("X");
			}
			System.out.println();
		}
		System.out.println();
	}

}
