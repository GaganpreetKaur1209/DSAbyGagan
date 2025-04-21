package RecursionAndBacktracking;

public class MazeProblemQues34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maze(3,3));
	}
	public static int maze(int r,int c) {
		if(r==1||c==1)
			return 1;
//		int count=0;
//		count+=maze(r-1,c);
//		count+=maze(r,c-1);
//		return count;
		
		//OR
		
		int left=maze(r-1,c);
		int right=maze(r,c-1);
		return left+right;
	}

}
