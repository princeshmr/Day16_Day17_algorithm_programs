package com.algorithm_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String");  //Mother in law
		String s1=scan.nextLine();
		System.out.println("Enter the Second String");  //Hitler Woman
		String s2=scan.nextLine();
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char ar1[]=s1.toCharArray();
		char ar2[]=s2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1, ar2)) {
			System.out.println(s1+" and "+s2+" are Anagram ");
		}
		else {
			System.out.println(s1+" and "+s2+" are Not Anagram ");
		}
		
		

	}

}
