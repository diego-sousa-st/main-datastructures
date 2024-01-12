package com.diegogouveia.sorting.impl;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void sort() {
        List<Integer> testCase = List.of(4, 3, 2, 1, 0, 10);
        System.out.println("List that will be sorted and tested with InsertSort: " + testCase);
        List<Integer> unsortedList = new ArrayList<>(testCase);
        InsertSort<Integer> insertSort = new InsertSort<>();

        Instant startTime = Instant.now();
        List<Integer> sortedList = insertSort.sort(unsortedList);
        Instant endTime = Instant.now();

        System.out.println("Elapsed time in sorting: " + (endTime.toEpochMilli() - startTime.toEpochMilli()) + " nanoseconds");

        List<Integer> testCaseSortedList = List.of(0, 1, 2, 3, 4, 10);
        assertEquals(testCaseSortedList.toString(), sortedList.toString());
        System.out.println("Expected result: " + testCaseSortedList);
        System.out.println("Result: " + sortedList);
    }

}