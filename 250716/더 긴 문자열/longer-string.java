import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if(a.length() > 20 || b.length() > 20) 
            return;
        if(a.length() == b.length()) 
            System.out.println("same");
        else if(a.length() > b.length())
            System.out.println(a + " " + a.length());
        else 
            System.out.println(b + " " + b.length()); 

    }
}