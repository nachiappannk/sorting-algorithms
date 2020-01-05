package com.nachiappan.sorts;

public class SelectionSorter implements Sorter {

    @Override
    public int[] sort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for(int j = i; j < input.length; j++){
                if(input[minIndex] > input[j]){
                    minIndex = j;
                }
            }
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }
}
