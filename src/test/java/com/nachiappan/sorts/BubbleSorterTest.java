package com.nachiappan.sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSorterTest {

    @Test
    public void bubbleSortTests(){
        BubbleSorter sorter = new BubbleSorter();
        int[] input = new int[]{6,5,4,3,2,1};
        int[] output = sorter.sort(input);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, output);
    }
}