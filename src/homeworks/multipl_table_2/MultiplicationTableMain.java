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

        //cycle

        Scanner in = new Scanner(System.in);
        System.out.print("Input array lenght: ");
        int arrayLenghtConsole = in.nextInt();
        int[] arrayConsole = new int[arrayLenghtConsole];
        for (int i = 0; i < arrayLenghtConsole; i++) {
            System.out.print("Array [" + i + "] => ");
            arrayConsole[i] = in.nextInt();
        }

        //System.out.println(arrayLenghtConsole);

        in.close();

    }
}
