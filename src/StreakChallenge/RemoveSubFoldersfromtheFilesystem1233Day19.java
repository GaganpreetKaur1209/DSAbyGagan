package StreakChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersfromtheFilesystem1233Day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
		System.out.println(removeSubfolders(folder));
	}
	 public static List<String> removeSubfolders(String[] folder) {
		 Arrays.sort(folder);
		 List<String> list=new ArrayList<>();
		 list.add(folder[0]);
		 for(int i=1;i<folder.length;i++) {
			 String lastfolder=list.get(list.size()-1);
			 if(!folder[i].startsWith(lastfolder))
				 list.add(folder[i]);
		 }
		return list;
	        	    }
}
