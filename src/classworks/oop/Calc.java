package oop;

public class Calc {
    private int counter;

    public int plus(int a, int b){
        return a + b;
    }

    private int plusSuper(int a, int b){ //к методу есть доступ только внутри класса Calc
        return a - b;
    }
}
