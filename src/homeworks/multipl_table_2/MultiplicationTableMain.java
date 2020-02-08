package homeworks.multipl_table_2;
import java.util.Scanner;

public class MultiplicationTableMain {
    public static void main(String[] args) {

        //multiplication table
        int startNumber = 2;
        int arrLenght = 9;

        int[] arrayNumbers = new int[arrLenght];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = startNumber++;
        }

        int half = arrayNumbers.length / 2;

        for (int i = half; i < arrayNumbers.length; i++) {
            double mod = arrayNumbers.length / half;
            if ( mod > 2 ){
                mod = arrayNumbers.length / ++half;
            } else {
                break;
            }
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j <= half; j++) {
                System.out.print(arrayNumbers[j] + " * " + arrayNumbers[i] + " = " + arrayNumbers[j] * arrayNumbers[i] + "\t\t");
            }
            System.out.print("\n");
        }
        System.out.println("");
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = half + 1; j < arrayNumbers.length; j++) {
                System.out.print(arrayNumbers[j] + " * " + arrayNumbers[i] + " = " + arrayNumbers[j] * arrayNumbers[i] + "\t\t");
            }
            System.out.print("\n");
        }
        System.out.println();

        //cycle
        System.out.println("2.1 cycle");
        Scanner in = new Scanner(System.in);
        System.out.print("Input array lenght: ");
        int arrayLenghtConsole = in.nextInt();
        int[] arrayConsole = new int[arrayLenghtConsole];
        for (int i = 0; i < arrayLenghtConsole; i++) {
            System.out.print("Array [" + i + "] => ");
            arrayConsole[i] = in.nextInt();
        }
        in.close();
        System.out.println();
        //for
        System.out.print("for:" + "\t\t\t");
        for (int i = 0; i < arrayConsole.length; i++) {
            System.out.print( arrayConsole[i] + "\t\t");
        }
        System.out.println();
        //foreach
        System.out.print("foreach:" + "\t\t");
        for (int i : arrayConsole) {
            System.out.print( i + "\t\t");
        }
        System.out.println();
        //while
        System.out.print("while:" + "\t\t\t");
        int k= 0;
        while ( k < arrayConsole.length){
            System.out.print( arrayConsole[k] + "\t\t");
            k++;
        }
        System.out.println();
        //do while
        System.out.print("do while:" + "\t\t");
        int t= 0;
        do {
            System.out.print( arrayConsole[t] + "\t\t");
            t++;
        }while ( t < arrayConsole.length);
        System.out.println();


        //second
        System.out.println("2.2 second");
        //for
        System.out.print("for:" + "\t\t\t");
        for (int i = 1; i < arrayConsole.length; i += 2) {
            System.out.print( arrayConsole[i] + "\t\t");
        }
        System.out.println();
        //foreach
        System.out.print("foreach:" + "\t\t");
        int key = 1;
        for ( int i : arrayConsole) {
            if( key % 2 == 0){
                System.out.print( i + "\t\t");
            }
            key++;
        }
        System.out.println();
        //while
        System.out.print("while:" + "\t\t\t");
        int k2 = 1;
        while ( k2 < arrayConsole.length){
            System.out.print( arrayConsole[k2] + "\t\t");
            k2 += 2;
        }
        System.out.println();
        //do while
        System.out.print("do while:" + "\t\t");
        int t2 = 1;
        do {
            System.out.print( arrayConsole[t2] + "\t\t");
            t2 += 2;
        }while ( t2 < arrayConsole.length);
        System.out.println();
    }
}
