package homeworks.calc_1;

//круги эйлера почитать!!

public class CalcMain2 {
    public static void main(String[] args) {
        CalculatorWithOperator operator = new CalculatorWithOperator();
        CalculatorWithMath math = new CalculatorWithMath();
        CalculatorWithCounter counter = new CalculatorWithCounter();

        ICalculator calcUni = new CalculatorWithOperator();
        calcUni = new CalculatorWithMath();
        calcUni = new CalculatorWithCounter();
        calcUni = new CalculatorWithCounter2(new CalculatorWithMath());
    }
}
