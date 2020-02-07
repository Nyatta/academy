package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int data = plus(6, 1);
        data = minus(data, 3);
        System.out.println(data);
    }

    public static int plus(int a, int b){
        return a + b;
    }
    public static int minus( int a, int b){ return a - b; }
}
