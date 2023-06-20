package chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
   @Test
   public void findSquareOneTest(){
      Arithmetic testArithmetic = new Arithmetic();
      double squareOne = testArithmetic.getSquare(7);
      assertEquals(49,squareOne);
   }

//   @Test
//   public void findSquareTwoTest(){
//      Arithmetic testArithmetic = new Arithmetic();
//      double squareTwo = testArithmetic.getSquareTwo(8);
//      assertEquals(64,squareTwo);
//   }

   @Test
   public void findDifferenceSquareTest(){
      Arithmetic testArithmetic = new Arithmetic();
      double squareDifference = testArithmetic.getSquareDifference(4,3);
      assertEquals(7,squareDifference);
   }

}