package homeworks.calc_1;

public class CalculatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculator = new CalculatorWithOperator();
        CalculatorWithMath calculatorMath = new CalculatorWithMath();
        CalculatorWithMath calculatorCounter = new CalculatorWithCounter();

        System.out.println("умножение " + calculator.multipl(5, 7));
        System.out.println("деление " + calculator.division(45, 7));
        System.out.println("отнять " + calculator.minus(58, 1474));
        System.out.println("сложить " + calculator.plus(64, 92));
        System.out.println("модуль " + calculator.abs(-13));
        System.out.println(" ");

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double res = calculator.plus(4.1, calculator.plus(calculator.multipl(15, 7), calculator.sqrt(calculator.division(28, 5))) );
        double resMath = calculatorMath.plus(4.1, calculatorMath.plus(calculatorMath.multipl(15, 7), calculatorMath.sqrt(calculatorMath.division(28, 5))) );
        System.out.println("без MATH");
        System.out.println("результат = " + res);
        System.out.println("результат /0 = " + res/0);
        System.out.println("результат /0.0d = " + res/0.0d);
        System.out.println(" ");
        System.out.println("с MATH");
        System.out.println("результат = " + resMath);
        System.out.println("результат /0 = " + resMath/0);
        System.out.println("результат /0.0d = " + resMath/0.0d);
    }
}
