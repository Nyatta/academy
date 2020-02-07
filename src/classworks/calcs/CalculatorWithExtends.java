package homework.calcs;

//сигнатура это имя метода, его параметры и типы его параметров
//переопределение - метод с одинаковым количеством и типами переменных
//перегрузка - оъявление метода, но с разным количеством переменных и типов этих парааметров

public class CalculatorWithExtends extends CalculatorWithOperator {

    /*public int plus(int a, int b){
        return a - b;
    }*/

    public int plus2(int a, int b){
        return a + b;
    }

    public int divide(int a, int b){
        return a / b;
    }

}
