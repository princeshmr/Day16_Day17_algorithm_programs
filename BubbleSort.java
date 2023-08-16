package com.algorithm_programs;

public class BubbleSort {

	public static void main(String[] args) {
		int []ar={40,30,10,70,50,20,60,22,44};
		
		for(int i=0;i<=ar.length-2;i++) {
			for(int j=0;j<=ar.length-2;j++) {
				if(ar[j] > ar[j+1]) {
					int temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int data:ar) {
			System.out.print(data+" ");
		}
		System.out.println();
	}

}
