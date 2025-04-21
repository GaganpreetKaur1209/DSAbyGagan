package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class RankTransformofanArray1331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40,10,20,30};
		System.out.println(Arrays.toString(arrayRankTransform(arr)));
	}
public static int[] arrayRankTransform(int[] arr) {
	int copiedarr[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		copiedarr[i]=arr[i];
	}
	Arrays.sort(copiedarr);
	HashMap<Integer,Integer> map=new HashMap<>();
	int rank=1;
	for(int num:copiedarr) {
		if(!map.containsKey(num)) {
		map.put(num, rank);
		rank++;
		}
	}
	int count[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		count[i]=map.get(arr[i]);
	}
	return count;
	
	
    }
}
