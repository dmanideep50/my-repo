package com.project6;

public class BubbleSort {
	public static void main(String[] args) {
	new BubbleSort().sortArray();
}
int[] arr= {28,5,-21,6,49,3,5,77,3,2,42,0,5};
public void sortArray() {
	int size=arr.length;

		for(int i=0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("End of iteration:");
			for(int j=0;j<size-1;j++) {
				System.out.println(arr[j]+"");
		}
			System.out.println();
	}System.out.println("After sorting:");
	for(int i=0;i<size;i++) {
		System.out.println(arr[i]);
	   }
	}
}
