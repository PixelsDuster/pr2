package de.bht.pr2.lab02.part2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MyTest {
    
    int[] tab = {15, 37, 20 ,9, 0, 78, 305, 79, 42, 69, 420, 4, 8, 15, 16, 23, 42};
    int[] sortedTab = {0, 4, 8, 9, 15, 15, 16, 20, 23, 37, 42, 42, 69, 78, 79, 305, 420};

    @Test
    void bubbleSortTest() {
        assertArrayEquals(sortedTab, BubbleSort.sort(tab));
    }
    
    @Test
    void insertionSortTest() {
        assertArrayEquals(sortedTab, InsertionSort.sort(tab));
    }
    
    @Test
    void quickSortTest() {
        assertArrayEquals(sortedTab, QuickSort.sort(tab));
    }
    
}
