package oop;

public class OopMain {
    public static void main(String[] args) {
        /*System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);*/

        byte a = 10;
        short s = 10;
        int i = 10;
        long l = 10;

        boolean b = true;
        float f = 10;
        double d = 10;
        String str = "hell";

        Car carObject = new Car(1890);
        Car carObject2 = new Car();
        Car carObject3 = new Car(1890, 2020);

        //Car bmw = null;
        Car bmw;
        bmw = carObject;
        //Car bmw = new Car();


        //System.out.println(carObject.getYear());
        carObject.setYear(25);
        System.out.println(carObject.getYear());
        System.out.println(bmw.getYear());

    }
}
