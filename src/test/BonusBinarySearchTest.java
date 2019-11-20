package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class BonusBinarySearchTest {

    @Before
    public void setUp() {
        int[] arrayInt = {1, 17, 25, 62, 3, 43, 35, 7, 99, 56, 2, 11};
        int[] arraySizeOne = {55};
        int[] emptyArrayInt = {};
//        Double[] arrayDouble = {1.5, 3.2, 2.3, 8.9, 7.6};
//        Character[] arrayChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        String[] arrayString = {"apple", "LaunchCode", "Java", "Thanksgiving", "break", "epiphany", "imposter", "syndrome"};
        Arrays.sort(arrayInt);
//        Arrays.sort(arrayDouble);
//        Arrays.sort(arrayChar);
//        Arrays.sort(arrayString);
    }

    // Test #1 - emptyTest

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    /*
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */

    // Test #2

    @Test
    public void testArraySizeOneSuccess() {
        int[] arraySizeOne = {55};
        assertEquals(0, BonusBinarySearch.binarySearch(arraySizeOne, 55));
    }

    // Test #3

    @Test
    public void testArraySizeOneFail() {
        int[] arraySizeOne = {55};
        assertEquals(-1, BonusBinarySearch.binarySearch(arraySizeOne, 32));
    }


    // Test #3

//    @Test
//    public void testArraySizeOneFail2() {
//        int[] arraySizeOne = {55};
//        assertEquals(-1, BonusBinarySearch.binarySearch(arraySizeOne, 32));
//    }


    // Test #4

    @Test
    public void testArraySizeTenSuccess() {
        int[] arraySizeTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(7, BonusBinarySearch.binarySearch(arraySizeTen, 8));
    }


    // Test #5

    @Test
    public void testArraySizeTenFail() {
        int[] arraySizeTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(-1, BonusBinarySearch.binarySearch(arraySizeTen, 21));
    }



}
