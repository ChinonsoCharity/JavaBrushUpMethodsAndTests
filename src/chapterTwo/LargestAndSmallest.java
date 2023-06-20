package chapterTwo;

public class LargestAndSmallest {

    public int getSum(int inputOne,int inputTwo,int inputThree ) {
        return inputOne + inputTwo + inputThree;
    }

    public int getAverage(int inputOne,int inputTwo,int inputThree) {
        return (inputOne + inputTwo + inputThree)/3;
    }

    public int getProduct(int inputOne,int inputTwo,int inputThree) {
        return inputOne * inputTwo * inputThree;
    }

    public int getSmallest(int x, int y, int z) {
        if (x<=y && x<=z)return x;
        if(y<=x && y<=z)return y;
        return z;
    }

    public int getLargest(int x, int y, int z) {
        if (x >= y) {
            if (x >= z) return x;
        }
        if(y>=x){
            if (y>=z)
                return y;
        }
        return z;
    }
}
