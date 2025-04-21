package RecursionAndBacktracking;

public class MoveInAllDirectionsBacktrackingQues39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arr[][]= {{true,true,true},{true,false,true},{true,true,true}};
		maze(0,0,arr,"");
	}
	public static void maze(int r,int c,boolean arr[][],String ans) {
		if(r==arr.length-1 && c==arr[0].length-1) {
			System.out.println(ans);
			return;
		}
		if(!arr[r][c])
			return;
		arr[r][c]=false;
		if(r<arr.length-1) {
			maze(r+1,c,arr,ans+"D");
		}
		if(c<arr[0].length-1 ) {
			maze(r,c+1,arr,ans+"R");
		}
		if(r>0 ) {
			maze(r-1,c,arr,ans+"U");
		}
		if(c>0 ) {
			maze(r,c-1,arr,ans+"L");
		}
		arr[r][c]=true;
	}

}
