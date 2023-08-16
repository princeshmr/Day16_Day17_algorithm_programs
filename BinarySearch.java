package com.algorithm_programs;

import java.util.Arrays;

public class BinarySearch {

	
	public static void main(String[] args) {
		String []ar= {"hii","bye","good","bad","my"};
		Arrays.sort(ar);
		int index=Arrays.binarySearch(ar, "good");
		if(index > 0) {
			System.out.println("Element Found At Position: "+index);
		}
		else {
			System.out.println("Element Found Is Not Found");
		}
	}

}
