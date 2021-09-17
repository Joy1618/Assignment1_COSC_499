import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class test extends Main{

    //unsorted array of integers
    int[] unsorted = {2,1,4,3};

    //sorted array
    int[] sorted = {1,2,3,4};;

    //descending sorted array
    int[] DescSorted = {4,3,2,1};

    // This is test for Insertion Sort
    @Test
    public void InsertionSortTest() {
        int[] t = InsertionSort(unsorted);
        assertArrayEquals(sorted, t);
    }
    //This is the test for descending array
    @Test
    public void DescTest() {
        int[] s = reverse(sorted);
        assertArrayEquals(DescSorted, s);
    }
}
