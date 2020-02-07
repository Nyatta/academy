package oop;
/*
    getYear and setYear - методы класса
    конструктор не имеет возвращаемого значения, его имя совпадает с именем класса Car
 */

public class Car {
    private int year;

    public Car(int year){ //конструктор
        this.year = year;
    }
    public Car(){ //конструктор
        this.year = year;
    }
    public Car(int year, int year2){ //конструктор
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    //this.year относится к объекту класса Car, уточнение области видимости
    public void setYear(int year) {
        this.getYear();
        this.year = year;
    }
}
