package Array;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12, 35, 1, 10, 34, 1};
		//int arr[]= {10,10};
System.out.println(secondlargest(arr));
	}
	public static int secondlargest(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		int max2=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max2 && arr[i]<max)
				max2=arr[i];
		}
		return max2;
	}

}
