package RecursionAndBacktracking;

public class NumberofStepstoReduceaNumbertoZero1342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		System.out.println(numberOfSteps(n));
	}
	 static int count=0;//global variable
	    public static int numberOfSteps(int num) {
	        if(num==0)
	        return count;
	        if(num%2==0)
	        numberOfSteps(num/2);
	        else
	        numberOfSteps(num-1);
	        count++;
	        return count;
	    }
}
