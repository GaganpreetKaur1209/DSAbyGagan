package LinearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {70,40,80,11,57,41,25,14,52};
System.out.println(search(arr,41));
	}
	public static int search(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return i;
		}
		return -1;
	}

}
