package homeworks.calc_1;

//super обращение к родителю


public class CalculatorWithCounter extends CalculatorWithMath{

    private int counter;

    public double abs(double a){
        this.counter++;
        getCounter();
        this.getCounter();
        return super.abs(a);
    }

    public int getCounter(){
        return counter;
    }
}
