package homeworks.calc_1;

public class CalculatorWithOperator implements ICalculator {

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
        for (int i = 2; i <= b; i++) {
            a = a * i;
        }
        return a;
    }

    public double abs(double a){
        if (a < 0){
            return -1 * a;
        }else{
            return a;
        }
    }

    public double sqrt(double a){
        double root = a / 2;
        double eps = 0.01;
        int iter = 0;
        while( root - a / root > eps ){
            iter++;
            root = 0.5 * (root + a / root);
        }
        return root;
    }
}
