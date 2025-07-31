import java.util.Scanner;

class IntWrapper {
    private int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
public class Main {
    public static void fun(IntWrapper a, IntWrapper b) {
        if(a.getValue() > b.getValue()){
            a.setValue(a.getValue() + 25);
            b.setValue(b.getValue()*2);
        } else {
            a.setValue(a.getValue()*2);
            b.setValue(b.getValue() + 25);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);

        fun(aWrapper, bWrapper);

        a = aWrapper.getValue();
        b = bWrapper.getValue();
        System.out.println(a + " " + b);
    }
}