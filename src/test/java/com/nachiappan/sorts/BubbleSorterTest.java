package com.nachiappan.sorts;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BubbleSorterTest {

    @Test
    @Parameters({
            "bubbleSort",
            "insertionSort"
            })
    public void bubbleSortTests(String algorithmName){

        Sorter sorter = getSorter(algorithmName);
        int[] input = new int[]{6,5,4,3,2,1};
        int[] output = sorter.sort(input);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, output);
    }

    private Sorter getSorter(String algorithmName){
        switch (algorithmName){
            case "bubbleSort": return new BubbleSorter();
            case "insertionSort" : return new InsertionSorter();
            default:throw new Error("Unkown algorithm");
        }
    }
}