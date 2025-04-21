package RecursionAndBacktracking;

public class FirstIndexOfAnElementQues7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,13,7,5,3,4,5,6,3,9,3};
		System.out.println(first(arr,0,3));
	}
	public static int first(int arr[], int index, int target) {
		if(index==arr.length)
			return -1;
		if(arr[index]==target)
			return index;
		return first(arr, index+1, target);
	}

}
