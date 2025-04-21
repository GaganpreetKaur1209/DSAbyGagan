package StreakChallenge;

public class CheckIfaWordOccursA1455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "i love eating burger";
		String searchWord = "burg";
		System.out.println(isPrefixOfWord(sentence,searchWord));
	}
public static int isPrefixOfWord(String sentence, String searchWord) {
        if(!sentence.contains(searchWord))
        	return -1;
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].startsWith(searchWord))
        		return i+1;
        }
        return -1;
    }
}
