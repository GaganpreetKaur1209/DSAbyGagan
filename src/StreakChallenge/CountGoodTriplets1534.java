package StreakChallenge;

public class CountGoodTriplets1534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,3,7,3,12,1,12,2,3};
		int a=5;
		int b=8;
		int c=1;
		System.out.println(countGoodTriplets(arr,a,b,c));
	}
	    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
	        int count=0;
	        for(int i=0;i<arr.length-2;i++){
	            for(int j=i+1;j<arr.length-1;j++){
	                for(int k=j+1;k<arr.length;k++){
	                    if(Math.abs(arr[i]-arr[j])>a)
	                    continue;
	                    else if(Math.abs(arr[j]-arr[k])>b)
	                     continue;
	                    else if(Math.abs(arr[i]-arr[k])>c)
	                     continue;
	                    else 
	                        count++;
	                }
	            }
	        }
	        return count;
	    }
	}






