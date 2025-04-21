package RecursionAndBacktracking;

public class SubsequenceCountQues12 {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="abc";
		sub(word," ");
		System.out.println(count);
	}
	public static void sub(String word, String ans) {
		if(word.length()==0){
			count++;
			return ;
		}
		char ch=word.charAt(0);
		 sub(word.substring(1), ans);
		 sub(word.substring(1), ans+ch);
		
	}

}
