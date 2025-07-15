import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int sex = scanner.nextInt();
        int year = scanner.nextInt();
        if(year < 1 && year > 100) {
            return;
        } else {
            if (sex == 0) {
                if(year >= 19)
                    System.out.println("MAN");
                else 
                    System.out.println("BOY");
            } 
            if (sex == 1) {
                if(year >= 19) 
                    System.out.println("WOMAN");
                else 
                    System.out.println("GIRL");
            }
        }
    }
}