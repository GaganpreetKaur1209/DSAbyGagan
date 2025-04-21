package RecursionAndBacktracking;

public class PrintingThePathMazeProblemQues35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maze(3,3,"");
	}
	public static void maze(int r,int c,String ans) {
		if(r==1 && c==1){
			System.out.println(ans);
			return;
		}
		if(r>1)
		maze(r-1,c,ans+"D");
		if(c>1)
		maze(r,c-1,ans+"R");
	
	}

}
