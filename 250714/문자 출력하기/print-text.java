import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        char c;
        c = scanner.next().charAt(0);
        for(int i=0; i<8; i++) {
            System.out.print(c);
        }
    }
}