package operator;

public class ReturnMain {
    public static void main(String[] args) {
        //printFirstFiveElements(10);

        ReturnMain m = new ReturnMain();
        m.printFirstFiveElements(10);
    }

    public void printFirstFiveElements(int count){
        for (int i = 0; i < count; i++) {
            System.out.println(i);
            if(i == 5) return;
        }
    }
}
