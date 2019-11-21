package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class BonusBinarySearchTest {

    private int[] arrayInt = {1, 17, 25, 62, 3, 43, 35, 7, 99, 56, 2, 11};
    private int[] arraySizeTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] arraySizeOne = {55};
    private int[] emptyArrayInt = {};
    private int[] arraySizeEleven = new int [11];
    Double[] arrayDouble = {1.5, 3.2, 2.3, 8.9, 7.6};
    Character[] arrayChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    String[] arrayString = {"apple", "LaunchCode", "Java", "Thanksgiving", "break", "epiphany", "imposter", "syndrome"};

    @Before
    public void setUp() {
        Arrays.sort(arrayInt);
        arraySizeEleven[0] = 1;
        arraySizeEleven[1] = 16;
        arraySizeEleven[2] = 32;
        /*arraySizeEleven[3] = 41;
        arraySizeEleven[4] = 42;
        arraySizeEleven[5] = 43;
        arraySizeEleven[6] = 44;
        arraySizeEleven[7] = 45;
        arraySizeEleven[8] = 46;
        arraySizeEleven[9] = 47;
        arraySizeEleven[10] = 48;*/

        Arrays.sort(arraySizeEleven);
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
//        int[] arraySizeOne = {55};
        assertEquals(0, BonusBinarySearch.binarySearch(arraySizeOne, 55));
    }

    // Test #3

    @Test
    public void testArraySizeOneFail() {
//        int[] arraySizeOne = {55};
        assertEquals(-1, BonusBinarySearch.binarySearch(arraySizeOne, 32));
    }

    // Test #4

    @Test
    public void testArraySizeTenRightHalfSuccess() {
//        int[] arraySizeTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(7, BonusBinarySearch.binarySearch(arraySizeTen, 8));
    }

    // Test #5

    @Test
    public void testArraySizeTenLeftHalfSuccess() {
//        int[] arraySizeTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1, BonusBinarySearch.binarySearch(arraySizeTen, 2));
    }

    // Test #6

    @Test
    public void testArraySizeTenFail() {
//        int[] arraySizeTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(-1, BonusBinarySearch.binarySearch(arraySizeTen, 21));
    }

    // Test #7

    @Test
    public void testArrayIntSuccess() {
//        int[] arrayInt = {1, 17, 25, 62, 3, 43, 35, 7, 99, 56, 2, 11};
//        Arrays.sort(arrayInt);
        assertEquals(7, BonusBinarySearch.binarySearch(arrayInt, 35));
    }

    // Test #8

    @Test
    public void testEmptyArray() {
//        int[] emptyArrayInt = {};
        assertEquals(-1, BonusBinarySearch.binarySearch(emptyArrayInt, 17));
    }

    // Test #9

    @Test
    public void testMiddleOfArraySizeEleven() {
        assertEquals(9, BonusBinarySearch.binarySearch(arraySizeEleven, 16));
    }

}
