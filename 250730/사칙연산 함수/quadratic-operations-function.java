import java.util.Scanner;
public class Main {
    public static void fun (int a, char o, int c) {
        if(o != '+' && o != '-' && o != '/' && o != '*') {
            System.out.println("False");
            return;
        }
        switch(o) {
            case '+' :
                System.out.println(a + " + " + c + " = " + (a+c));
                break;
            case '-' :
                System.out.println(a + " - " + c + " = " + (a-c));
                break;
            case '/' :
                System.out.println(a + " / " + c + " = " + (a/c));
                break;
            case '*' : 
                System.out.println(a + " * " + c + " = " + (a*c));
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        fun(a, o , c);
    }
}