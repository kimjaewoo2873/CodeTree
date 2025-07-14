import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Please write your code here.
        int n = scanner.nextInt();
        for(int i=1;i<=5;i++) { 
            System.out.print((n*i) + " ");
        }
    }
}