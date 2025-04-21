package StreakChallenge;

public class ConstructSmallestNumberFromDIString2375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "IIIDIDDD";
		System.out.println(smallestNumber(pattern));
	}
	public static String smallestNumber(String pattern) {
        int arr[]=new int[pattern.length()+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<pattern.length();i++){
            int temp=i;
            while(temp<pattern.length() && pattern.charAt(temp)=='D'){
                temp++;
            }
           
            if(i!=temp){
                 reverse(arr,i,temp);
            i=temp-1;}
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public static void reverse(int arr[], int left,int right){
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}