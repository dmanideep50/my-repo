package com.project6;

public class BinarySearch {

	public static void main(String[] args) {
        
		int SearchItem=8;
        BinarySearch bs=new BinarySearch();
        boolean status=bs.binarySearch(SearchItem);
        System.out.println(status);
//        if(status)
//       	 System.out.println("Found");
//        else
//       	 System.out.println("Not Found");
	}
	int [] arr= {5,8,1,6, 14,18,22,50};
	public boolean binarySearch(int SearchItem) {
		boolean isFound=false;
		int low=0;
		int high=arr.length-1;
		int mid=0;
		int itr=0;
		while(low<=high) {
			itr++;
			mid=(low+high)/2;
			int arrValue=arr[mid];
			if(SearchItem==arrValue) {
				isFound=true;
			break;
			}else if(SearchItem<arrValue) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
     System.out.println(itr);
	return isFound;
	}
}
