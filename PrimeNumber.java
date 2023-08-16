package com.algorithm_programs;

import java.util.Scanner;

public class PrimeNumber {

	public void primeNumber(int first , int second) {
        int i , j , count;

        for(i=first;i<=second;i++) {
            if(i==0 || i==1)
                continue;
            count = 1;

            for(j=2;j<=i/2;++j) {
                if(i%j == 0) {
                    count = 0;
                    break;
                }
            }
            if(count == 1)
                System.out.print(i+" ");
        }
    }
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Lower Bound: ");
        int first = scan.nextInt();

        System.out.print("Upper Bound: ");
        int second = scan.nextInt();

        PrimeNumber prime = new PrimeNumber();
        prime.primeNumber(first,second);
	}

}
