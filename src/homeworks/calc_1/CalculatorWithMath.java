package homeworks.calc_1;

public class CalculatorWithMath {
    public double multipl(double a, double b){
        return a * b;
    }

    public double division(double a, double b){
        return a / b;
    }

    public double minus(double a, double b){
        return a - b;
    }

    public double plus(double a, double b){
        return a + b;
    }

    public double exp(double a, int b){
        return Math.pow(a, b);
    }

    public double abs(double a){
        return Math.abs(a);
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }
}
