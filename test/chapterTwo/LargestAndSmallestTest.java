package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestAndSmallestTest {
    @Test
    public void findSumTest() {
        LargestAndSmallest testClass = new LargestAndSmallest();
        int sum = testClass.getSum(2, 3, 4);
        assertEquals(10, sum);
    }

    @Test
    public void findAverageTest() {
        LargestAndSmallest testClass = new LargestAndSmallest();
        int average = testClass.getAverage(2, 3, 4);
        assertEquals(3, average);
    }

    @Test
    public void findProductTest() {
        LargestAndSmallest testClass = new LargestAndSmallest();
        int product = testClass.getProduct(2, 3, 4);
        assertEquals(24, product);
    }

    @Test
    public void findTheSmallestTest() {
        LargestAndSmallest testClass = new LargestAndSmallest();
        int smallest = testClass.getSmallest(6, 3, 9);
        assertEquals(3, smallest);
    }
    @Test
    public void findTheLargestTest(){
        LargestAndSmallest testClass = new LargestAndSmallest();
        int largest = testClass.getLargest(6,3,9);
        assertEquals(9, largest);
    }
}