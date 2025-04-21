package StreakChallenge;

public class MaximumNumberofIntegerstoChooseFromaRangeI2554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] banned = {1,2,3,4,5,6,7};
		int n = 8;
		int maxSum = 1;
		System.out.println(maxCount(banned,n,maxSum));
	}
public static int maxCount(int[] banned, int n, int maxSum) {
	int arr[]=new int[10001];
	int sum=0;
	int c=0;
	for(int i=0;i<banned.length;i++) {
		arr[banned[i]]=1;
	}
	for(int i=1;i<=n;i++) {
		if(arr[i]==1)
			continue;
		sum+=i;
		if(sum>maxSum)
			break;
		c++;
	}
	return c;
    }
}
