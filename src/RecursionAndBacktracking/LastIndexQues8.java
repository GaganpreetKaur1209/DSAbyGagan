package RecursionAndBacktracking;

public class LastIndexQues8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,13,7,5,3,4,5,6,3,9,3,2,1,7};
		System.out.println(last(arr,arr.length-1,3));
	}
	public static int last(int arr[], int index, int target) {
		if(index<0)
			return -1;
		if(arr[index]==target)
			return index;
		return last(arr, index-1, target);
	}

}
