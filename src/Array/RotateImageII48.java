package Array;

public class RotateImageII48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}; 
		 int n=arr.length;
		rotate(arr);
		 for(int r=0;r<n;r++) {
	        	for(int c=0;c<n;c++) {
	        		System.out.print(arr[r][c]+ "  ->  ");
	        	}
	        	System.out.println();
		 }
	}
	 public static void rotate(int[][] matrix) {
		 int n=matrix.length;
	      for(int i=0;i<n;i++) {
	    	  for(int j=i;j<n;j++) {
	    		  int temp=matrix[i][j];
	    		  matrix[i][j]=matrix[j][i];
	    		  matrix[j][i]=temp;
	    	  }
	      }
	      for(int i=0;i<n;i++) {
	    	  int j=0,k=n-1;
	    	  while(j<k){
	    		  int temp=matrix[i][j];
	    		  matrix[i][j]=matrix[i][k];
	    		  matrix[i][k]=temp;
	    		  j++;
	    		  k--;
	    	  }
	      }
	    }
}
