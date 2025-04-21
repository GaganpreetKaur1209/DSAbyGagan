package RecursionAndBacktracking;

public class MazeWithObstaclesQues38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arr[][]= {{true,true,true},{true,false,true},{true,true,true}};
		maze(0,0,arr,"");
	}
	public static void maze(int r,int c,boolean arr[][],String ans) {
		if(r==arr.length-1 && c==arr.length-1) {
			System.out.println(ans);
			return;
		}
		if(r<arr.length-1 && arr[r+1][c]!=false)
			maze(r+1,c,arr,ans+"D");
		if(c<arr[0].length-1 && arr[r][c+1]!=false)
			maze(r,c+1,arr,ans+"R");
	}

}
