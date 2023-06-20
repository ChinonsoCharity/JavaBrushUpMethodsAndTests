package chapterTwo;

public class Arithmetic {
    public double getSquare(double inputOne) {
        return Math.pow(inputOne,2);
    }

//    public double getSquareTwo(double inputTwo) {
//        return Math.pow(inputTwo,2);
//    }

    public double getSquareDifference(double inputOne, double inputTwo) {
        return getSquare(inputOne) - getSquare(inputTwo);
    }
}
