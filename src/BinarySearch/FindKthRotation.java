package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindKthRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(findKRotation(list));
	}
	public static int findKRotation(List<Integer> arr) {
        // Code here
		int l=0;
		int h=arr.size()-1;
		int ans=Integer.MAX_VALUE;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr.get(l)<=arr.get(mid)) {
				ans=Math.min(ans,arr.get(l));
				l=mid+1;
			}
			else {
				ans=Math.min(ans,arr.get(mid));
				h=mid-1;
			}
		}
			return arr.indexOf(ans);
    }
}
