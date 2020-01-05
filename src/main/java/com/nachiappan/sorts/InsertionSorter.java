package com.nachiappan.sorts;

public class InsertionSorter implements Sorter {
    public int[] sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int numberToBeInserted = input[i];
            int insertionIndex = getInsertionIndex(input, numberToBeInserted);
            for (int j = i; j > insertionIndex; j--) {
                input[j] = input[j-1];
            }
            input[insertionIndex] = numberToBeInserted;
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
