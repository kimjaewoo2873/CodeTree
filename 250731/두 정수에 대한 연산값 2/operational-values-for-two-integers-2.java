import java.util.Scanner;
class IntWrapper {
    private int value;
    public IntWrapper(int value) {
        this.value = value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
public class Main {
    public static void fun(IntWrapper a, IntWrapper b){
        if(a.getValue() > b.getValue()) {
            a.setValue(a.getValue()*2);
            b.setValue(b.getValue()+10);
        } else {
            a.setValue(a.getValue()+10);
            b.setValue(b.getValue()*2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntWrapper aw = new IntWrapper(a);
        IntWrapper bw = new IntWrapper(b);

        fun(aw, bw);

        System.out.println(aw.getValue() + " " + bw.getValue());
    }
}