package AdvancedMaths;

public class CountPrimes204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
System.out.println(countPrimes(n));
	}
public static int countPrimes(int n) {
	if(n<=2)
        return 0;
        int arr[]=new int[n];
        arr[2]=1;
        for(int i=3;i<n;i+=2) {
        	arr[i]=1;
        }
        for(int i=3;i*i<n;i+=2) {
        	if(arr[i]==1) {
        		for(int j=i*i;j<n;j+=2*i) {
        			arr[j]=0;
        		}
        	}
        }
        int c=0;
        for(int i=2;i<n;i++) {
        	if(arr[i]==1)
        		c++;
        }
        return c;
    }
}
