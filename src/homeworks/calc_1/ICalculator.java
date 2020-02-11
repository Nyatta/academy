package homeworks.calc_1;

public interface ICalculator {
    default int plus(int a, int b){
        return a + b;
    }
}
