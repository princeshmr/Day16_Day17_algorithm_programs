package com.algorithm_programs;

public class InsertionSort {

	public <T extends Comparable<T>> T[] insertionSort(T[] array) {
        for (Integer i = 0; i < array.length; i++) {
            T x= array[i];
            int temp = i-1;
            while(temp >= 0 && array[temp].compareTo(x) > 0) {
                array[temp+1] = array[temp];
                temp = temp-1;
            }
            array[temp+1] = x;
        }
        return array;
    }

    public void displaySort(String[] array) {
        for (String j : array) {
            System.out.print(" "+j);
        }
        System.out.println();
    }
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();

        String array[] = {"hii","bye","good","bad","my"};
        String [] sortedArray = sort.insertionSort(array);
        sort.displaySort(sortedArray);

	}

}
