package StreakChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwo2DArraysbySummingValues2570 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums1 = {{1,2},{2,3},{4,5}};
		int[][] nums2 = {{1,4},{3,2},{4,1}};
		int ans[][]=mergeArrays(nums1,nums2);
		System.out.println(Arrays.deepToString(ans));//print in 2d array without for loop
	}
	public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0;
        int j=0;
        List<int[]> list = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                            list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                            i++;
                            j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                            list.add(new int[]{nums1[i][0], nums1[i][1]});
                            i++;
            }
            else{
                           list.add(new int[]{nums2[j][0], nums2[j][1]});
                            j++;
            }
        }
            while(i<nums1.length){
                list.add(new int[]{nums1[i][0], nums1[i][1]});
                            i++;
            }
             while(j<nums2.length){
                 list.add(new int[]{nums2[j][0], nums2[j][1]});
                            j++;
        }
        // int arr[][]=new int[list.size()][2];
        // for(int k=0;k<list.size();k++){
        //     arr[k][0]=list.get(k)[0];
        //     arr[k][1]=list.get(k)[1];
        // }
        // return arr;
        return list.toArray(new int[list.size()][2]);
    }
}