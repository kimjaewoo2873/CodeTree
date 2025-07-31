import java.util.Scanner;
public class Main {
    public static void palindrome(String input) {
        boolean flag = true;
        for(int i=0;i < input.length()/2;i++) {
            char c1 = input.charAt(i);
            char c2 = input.charAt(input.length()-1-i);
            if(c1 != c2) { 
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        palindrome(input);
    }
}