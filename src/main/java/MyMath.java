public class MyMath {

    private double lastResult = 0;

    public double SumOfCubes(double a, double b) {
        lastResult = (Math.pow(a, 3) + Math.pow(b, 3));
        return lastResult;
    }

    public boolean IsEven(int a) {
        return (a & 1) == 0;
    }

    public double Multiplication(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }

    public double getLastResult() {
        return lastResult;
    }
}
