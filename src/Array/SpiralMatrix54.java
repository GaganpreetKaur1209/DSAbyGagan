package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		List<Integer> list=spiralOrder(arr);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
     int top=0;
     int down=n-1;
     int left=0;
     int right=m-1;
     int d=0;
     while(top<=down && left<=right) {
    	 if(d==0) {
    		 for(int i=left;i<=right;i++) {
    			 list.add(matrix[top][i]);
    		 }
    		 top++;
    	 }
    	 else if(d==1) {
    		 for(int i=top;i<=down;i++) {
    			 list.add(matrix[i][right]);
    		 }
   			 right--;
    	 }
    	 else if(d==2) {
    		 for(int i=right;i>=left;i--) {
    			 list.add(matrix[down][i]);
    		 }
    		 down--;
    	 }
    	 else if(d==3) {
    		 for(int i=down;i>=top;i--) {
    			 list.add(matrix[i][left]);
    		 }
    		 left++;
    	 }
    	 d=(d+1)%matrix.length;
     }
       return list;
    }
}
