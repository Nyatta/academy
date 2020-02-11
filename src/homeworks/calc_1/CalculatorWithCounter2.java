package homeworks.calc_1;

public class CalculatorWithCounter2 implements ICalculator {
    private int counter;
//    private CalculatorWithOperator calculator1;
//    private CalculatorWithMath calculator2;
    private ICalculator calc;


//    public CalculatorWithCounter2(CalculatorWithOperator calculator){
//        this.calculator1 = calculator;
//
//    }
//
//    public CalculatorWithCounter2(CalculatorWithMath calculator){
//        this.calculator2 = calculator;
//
//    }

    public CalculatorWithCounter2(ICalculator calcInter){
        this.calc = calcInter;
    }

    public int getCounter(){
        return counter;
    }
}
