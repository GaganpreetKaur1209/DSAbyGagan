package RecursionAndBacktracking;

public class LinearSearchQues20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		System.out.println(search(arr,6,0));
	}
	public static boolean search(int arr[], int target,int index) {
	 if(index==arr.length)
			return false;
	return arr[index]==target || search(arr,target,index+1);
	
		
	}

}
