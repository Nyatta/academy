package homeworks.bitwise_2;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.print("Input name: ");
        String name = in.nextLine();

        MessagesInput mess = new MessagesInput();

        System.out.println(mess.MessagesInputIf(name));
        System.out.println(mess.MessagesInputIfElse(name));
        System.out.println(mess.MessagesInputSwitch(name));

        in.close();
    }
}
