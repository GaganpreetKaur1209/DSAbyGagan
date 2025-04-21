package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class PaintersPartitionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(3);
		int k=2;
		System.out.println(findLargestMinDistance(list,k));
	}
	public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {

        int low=0;
        int high=0;
        int ans=0;
        for(int i=0;i<boards.size();i++) {
        	low=Math.max(low, boards.get(i));
			high+=boards.get(i);
        }
        if(boards.size()==k)
        	return low;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(checkboards(boards, k, mid)) {
        		ans=mid;
        		high=mid-1;
        	}
        	else
        		low=mid+1;
        }
        return ans;
    }
	public static boolean checkboards(ArrayList<Integer> boards, int k, int mid) {
		int time=1;
		int sum=0;
		for(int i=0;i<boards.size();i++) {
			if(sum+boards.get(i)<=mid)
				sum+=boards.get(i);
			else {
				time++;
				sum=boards.get(i);
			}
		}return (time<=k);
	}
}
