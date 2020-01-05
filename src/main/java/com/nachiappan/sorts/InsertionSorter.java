package com.nachiappan.sorts;

public class InsertionSorter implements Sorter {
    public int[] sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int numberToBeInserted = input[i];
            int j = i;
            while((j > 0) && (numberToBeInserted< input[j-1])){
                input[j] = input[j - 1];
                j--;
            }
            input[j] = numberToBeInserted;
        }
        return input;
    }

    private int getInsertionIndex(int[] input, int element) {
        for (int i = 0; i < input.length; i++) {
            if(input[i] >= element) return i;
        }
        return input.length - 1;
    }
}
