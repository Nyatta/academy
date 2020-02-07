package operator;

public class OperatorsMain {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        a += 1;
        System.out.println(a);

        int sum = 0;
        int i = 0;
        while (i < 20){
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        }

        System.out.println("sum = " + sum);


    }
}
