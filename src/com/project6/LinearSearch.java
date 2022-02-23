package com.project6;

public class LinearSearch {

	public static void main(String[] args) {
         int Searchitem=9;
         LinearSearch ls=new LinearSearch();
         boolean status=ls.linearSearch(Searchitem);
         if(status)
        	 System.out.println("Found");
         else
        	 System.out.println("Not Found");
	}
	int [] arr= {5,8,1,6,9,3,7,2,4};
	public boolean linearSearch(int SearchItem) {
		boolean isFound=false;
		int size=arr.length;
		System.out.println("");
		for(int i=0;i<size;i++) {
			int value=arr[i];
		if(value==SearchItem) {
			isFound=true;
			break;
		}
	}
	return isFound;
	}
}