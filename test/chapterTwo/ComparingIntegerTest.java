package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingIntegerTest {
    @Test
    public void toSquareTest(){
        ComparingInteger testClass = new ComparingInteger();
        double square = testClass.toSquare(4);
        assertEquals(16,square);
    }
    @Test
    public void toCompareIntegerTest(){
        ComparingInteger testClass = new ComparingInteger();
        String compareInt = testClass.compareInteger(10);
        assertEquals(10 + " is less than 100",compareInt);
    }
    @Test
    public void toCompareSquareTest(){
        ComparingInteger testClass = new ComparingInteger();
        String compareSquare = testClass.compareSquare(10);
        assertEquals(100.0 + " is equal to 100",compareSquare);
    }

}