package StreakChallenge;

public class CountSymmetricIntegers2843 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSymmetricIntegers(1,100));
	}
		 public static int countSymmetricIntegers(int low, int high) {
		        int count = 0; // 🍥 Shadow Clone counter

		        for (int num = low; num <= high; num++) {
		            String str = Integer.toString(num); // 🎭 Transform number to string
		            int len = str.length();

		            // 🔥 Skip if it doesn't have even chakra balance (odd number of digits)
		            if (len % 2 != 0) continue;

		            int half = len / 2;
		            int leftSum = 0;
		            int rightSum = 0;

		            // ⬅️ Sum of the left half (first n digits)
		            for (int i = 0; i < half; i++) {
		                leftSum += str.charAt(i) - '0';
		            }

		            // ➡️ Sum of the right half (last n digits)
		            for (int i = half; i < len; i++) {
		                rightSum += str.charAt(i) - '0';
		            }

		            if (leftSum == rightSum) {
		                count++;
		            }
		        }

		        return count; // 🍥 Final mission report
		    }
}
