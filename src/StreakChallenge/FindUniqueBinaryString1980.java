package StreakChallenge;

public class FindUniqueBinaryString1980 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nums[] = {"01","10"};
		System.out.println(findDifferentBinaryString(nums));
	}
	public static String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(i) == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        return result.toString();
    }
}