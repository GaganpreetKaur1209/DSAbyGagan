package StreakChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountDaysWithoutMeetings3169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 10;
		int[][] meetings = {{5,7},{1,3},{9,10}};
		System.out.println(countDays(days, meetings));
	}
	 public static int countDays(int days, int[][] arr) {
	        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
	        List<int[]> list=new ArrayList<>();
	        for(int i[]:arr){
	           if( !list.isEmpty() &&  list.get(list.size()-1)[0] <= i[0] && i[0] <= list.get(list.size()-1)[1])
	           list.get(list.size()-1)[1]=Math.max(i[1],list.get(list.size()-1)[1]);
	           else
	           list.add(i);
	    }
	    int freeDays=0;
	    int lastmeeting=0;
	    for(int i[]:list){
	        int start=i[0];
	        int end=i[1];
	        freeDays+=start-lastmeeting-1;
	        lastmeeting=end;
	    }
	    freeDays+=days-lastmeeting;
	    return freeDays;
	    }
	}