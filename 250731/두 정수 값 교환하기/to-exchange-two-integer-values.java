import java.util.Scanner;

class IntWrapper {
    public int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}
public class Main {
    public static void changeNum(IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        IntWrapper nWrapper = new IntWrapper(n);
        IntWrapper mWrapper = new IntWrapper(m);
        
        changeNum(nWrapper, mWrapper);

        n = nWrapper.value;
        m = mWrapper.value;

        System.out.println(n + " " + m);
    }
}