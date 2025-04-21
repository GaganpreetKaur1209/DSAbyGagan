package RecursionAndBacktracking;

public class SubsequenceQues11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="abc";
		sub(word," ");
	}
	public static void sub(String word, String ans) {
		if(word.length()==0){
			System.out.println(ans);
			return;
		}
		char ch=word.charAt(0);
		 sub(word.substring(1), ans);
		 sub(word.substring(1), ans+ch);
	}

}
