package chapterTwo;

public class ComparingInteger {
    public double toSquare(int value) {
        return Math.pow(value,2);
    }

    public String compareInteger(int value) {
        if(value < 100)return value + " is less than 100";
        if(value > 100)return value + " is greater than 100";
        return value + " is equal to 100";

    }

    public String compareSquare(int value) {
        double square = toSquare(value);
        if(square < 100)return square + " is less than 100";
        if(square > 100)return square + " is greater than 100";
        return square + " is equal to 100";

    }
}
