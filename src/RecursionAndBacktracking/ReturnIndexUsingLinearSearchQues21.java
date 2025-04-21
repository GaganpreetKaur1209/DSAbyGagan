package RecursionAndBacktracking;

public class ReturnIndexUsingLinearSearchQues21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		System.out.println(search(arr,7,0));
	}
	public static int search(int arr[], int target,int index) {
	 if(index==arr.length)
			return -1;
	 else if(arr[index]==target)
		 return index;
	return  search(arr,target,index+1);
	
		
	}

}
