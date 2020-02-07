package homework.calcs;

public interface iCalc {
    default int plus(int a, int b){
        return a + b;
    }
}
