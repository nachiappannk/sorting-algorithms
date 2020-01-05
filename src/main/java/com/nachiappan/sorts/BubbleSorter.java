package com.nachiappan.sorts;

import java.util.ArrayList;

public class BubbleSorter implements Sorter {
    /*
    * Worst : O(n^2)
    * Best : O(n)
    * Average : O(n^2)
    *
    * Memory O(1)
    * */

    @Override
    public int[] sort(int[] input){
        for (int i = 0; i < input.length; i++) {
            boolean swapped = false;
            for (int j = 1; j + i < input.length; j++) {
                if(input[j- 1] > input[j]){
                    int temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return input;
    }
}

