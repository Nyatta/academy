package homeworks.multipl_table_2;

import java.util.Random;

public class MultiplicationTableMain {
    public static void main(String[] args) {

        int startNumber = 2;
        int arrLenght = 7;

        int[] arrayNumbers = new int[arrLenght];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = startNumber++;
//            System.out.println(arrayNumbers[i]);
        }

        int half = arrayNumbers.length / 2;

        for (int i = half; i < arrayNumbers.length; i++) {
            double mod = arrayNumbers.length / half;
            if ( mod >= 2 ){
                mod = arrayNumbers.length / ++half;
            } else {
                break;
            }
        }
        System.out.println("half - " + half);

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < arrayNumbers.length; j++) {
                //String res =
                System.out.println(arrayNumbers[i] + " * " + arrayNumbers[j] + " = " + arrayNumbers[i] * arrayNumbers[j]);
            }
            System.out.println("");
        }

        for (int i = half; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers.length; j++) {
                System.out.println(arrayNumbers[i] + " * " + arrayNumbers[j] + " = " + arrayNumbers[i] * arrayNumbers[j]);
            }
            System.out.println("");
        }



    }
}
