package homeworks.bitwise_2;

public class BitwiseMain {
    public static void main(String[] args) {

        System.out.println("Побитовый NOT");
        /*
         42 00101010
        ~42 11010101
         15 00001111
        ~15 11110000

          -42 11010110
        ~(-42) 00101001
          -15 11110001
        ~(-15) 00001110
         */
        System.out.println("~42 = " + ~42);
        System.out.println("~15 = " + ~15);
        System.out.println("~-42 = " + ~-42);
        System.out.println("~-15 = " + ~-15);
        System.out.println("");
        System.out.println("Побитовый AND");
        /*
        42 & 15:
        00101010
        00001111
        --------
        00001010  10

        -42 & -15:
        11010110
        11110001
        --------
        11010000  -48
         */
        System.out.printf("42 & 15 = %s\n", (42 & 15));
        System.out.printf("-42 & -15 = %s\n", (-42 & -15));
        System.out.println("");
        System.out.println("Побитовый AND +присваивание");
        /*
        a = 42
        a &= 15:
        00101010
        00001111
        --------
        00001010  10

        b =- 42
        b &= -15:
        11010110
        11110001
        --------
        11010000  -48
         */
        byte a = 42;
        a &= 15;
        byte b = -42;
        b &= -15;
        System.out.println("42 &= 15 : " + a);
        System.out.println("-42 &= -15 : " + b);
        System.out.println("");
        System.out.println("Побитовый OR");
        /*
        42 | 15
        00101010
        00001111
        --------
        00101111  47

        -42 | -15
        11010110
        11110001
        --------
        11110111  -9
         */
        System.out.printf("42 | 15 = %s\n", (42 | 15));
        System.out.printf("-42 | -15 = %s\n", (-42 | -15));
        System.out.println("");
        System.out.println("Побитовый OR +присваивание");
        /*
        42 |= 15
        00101010
        00001111
        --------
        00101111  47

        -42 |= -15
        11010110
        11110001
        --------
        11110111  -9
         */
        byte aor = 42;
        aor |= 15;
        byte bor = -42;
        bor |= -15;
        System.out.println("42 |= 15 : " + aor);
        System.out.println("-42 |= -15 : " + bor);
        System.out.println("");
        System.out.println("Побитовый исключающее OR");
        /*
        42 ^ 15
        00101010
        00001111
        --------
        00100101  37

        -42 ^ -15
        11010110
        11110001
        --------
        00100111  39

         */
        System.out.printf("42 ^ 15 = %s\n", (42 ^ 15));
        System.out.printf("-42 ^ -15 = %s\n", (-42 ^ -15));
        System.out.println("");
        System.out.println("Побитовый исключающее OR +присваивание");
        /*
        42 ^= 15
        00101010
        00001111
        --------
        00100101  37

        -42 ^= -15
        11010110
        11110001
        --------
        00100111  39
         */
        byte anor = 42;
        anor ^= 15;
        byte bnor = -42;
        bnor ^= -15;
        System.out.println("42 ^= 15 : " + anor);
        System.out.println("-42 ^= -15 : " + bnor);
        System.out.println("");
        System.out.println("Сдвиг");


        System.out.printf("42 >> 2 = %s\n", (42 >> 2)); //00101010 >>2 = 00001010 10
        System.out.printf("15 >> 2 = %s\n", (15 >> 2)); //00001111 >>2 = 00000011 3
        System.out.printf("42 << 2 = %s\n", (42 << 2)); //00101010 <<2 = 10101000 168
        System.out.printf("15 << 2 = %s\n", (15 <<  2)); //00001111 <<2 = 00111100 60
        System.out.printf("42 >>> 2 = %s\n", (42 >>> 2)); //00101010 >>>2 = 00001010 10
        System.out.printf("15 >>> 2 = %s\n", (15 >>> 2)); //00001111 >>>2 = 00000011 3

    }
}
