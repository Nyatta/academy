package homeworks.bitwise_2;

public class OperatorsMain {
    public static void main(String[] args) {
        System.out.println(5 + 2 / 8); //5
        System.out.println((5 + 2) / 8); //0
        int a1 = 2, b1 = 8;
        System.out.println((5 + (a1++)) / b1); //(5 + 2++) / 8 = 0
        int a2 = 2, b2 = 8;
        System.out.println((5 + (a2++)) / (--b2)); //(5 + 2++) / --8 = 1
        int a3 = 2, b3 = 8;
        System.out.println((5 * 2 >> a3++) / --b3); //(5 * 2 >> 2++) / --8 = 0
        int a4 = 2, b4 = 8;
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> a4++) / --b4); // (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = 1
        int a5 = 2, b5 = 8;
        //float res = (5 + 7 > 20) ? 68 >= 68 : 22 * 2 >> a5++; //Required type: float Provided: boolean
        //System.out.println( res / --b5); //(5 + 7 > 20 ? 68 => 68 : 22 * 2 >> 2++) / --8
        System.out.println( 6 - 2 > 3 && 12 * 12 <= 119);  //6 - 2 > 3 && 12 * 12 <= 119 = false
    }
}
