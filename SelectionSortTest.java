import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class SelectionSortTest {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public SelectionSortTest() {
	testPositive();
    testNegative();
    testMixed();
    testDuplicates();
}
<<<<<<< HEAD
 private void testPositive() {
                int[] arr = new int[5];
                arr[0] = 8;
                arr[1] = 9;
                arr[2] = 7;
                arr[3] = 12;
                arr[4] = 1;

                int[] Sortedarr = new int[5];
                Sortedarr[0] = 1;
                Sortedarr[1] = 7;
                Sortedarr[2] = 8;
                Sortedarr[3] = 9;
=======
    private void testMixed() {
                /** Test data contains with both positive, negative and zeros **/
                int[] arr = new int[5];
                arr[0] = 8;
                arr[1] = -9;
                arr[2] = 0;
                arr[3] = -10;
                arr[4] = -2;
                int[] Sortedarr = new int[5];
                Sortedarr[0] = -10;
                Sortedarr[1] = -9;
                Sortedarr[2] = -2;
                Sortedarr[3] = 0;
                Sortedarr[4] = 8;

                SelectionSort selectionSort = new SelectionSort();
                /** add tests to check for this unit test **/
                assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));

        }

        private void testDuplicates() {
                /** Test data contains duplicates **/
                int[] arr = new int[5];
                arr[0] = 8;
                arr[1] = 12;
                arr[2] = 4;
                arr[3] = 12;
                arr[4] = 4;

                int[] Sortedarr = new int[5];
                Sortedarr[0] = 4;
                Sortedarr[1] = 4;
                Sortedarr[2] = 8;
                Sortedarr[3] = 12;
>>>>>>> Two
                Sortedarr[4] = 12;

                SelectionSort selectionSort = new SelectionSort();
                /** add tests to check for this unit test **/
                assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));

        }
<<<<<<< HEAD

        private void testNegative() {
                /** Test data contains negative values only **/
                int[] arr = new int[5];
                arr[0] = -8;
                arr[1] = -9;
                arr[2] = -7;
                arr[3] = -12;
                arr[4] = -1;
                int[] Sortedarr = new int[5];
                Sortedarr[0] = -12;
                Sortedarr[1] = -9;
                Sortedarr[2] = -8;
                Sortedarr[3] = -7;
                Sortedarr[4] = -1;

                SelectionSort selectionSort = new SelectionSort();
                /** add tests to check for this unit test **/
                assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));

        }

       
=======
     
>>>>>>> Two
 
}