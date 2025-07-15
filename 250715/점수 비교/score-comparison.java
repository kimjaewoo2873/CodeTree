import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int Amath = scanner.nextInt();
        int Aenglish = scanner.nextInt();
        int Bmath = scanner.nextInt();
        int Benglish = scanner.nextInt();
        
        if(Amath < 1 && Amath > 100 && Aenglish < 1 && Aenglish > 100) {
            return;
        }
        if(Bmath < 1 && Bmath > 100 && Benglish < 1 && Benglish > 100) {
            return;
        }
        if(Amath > Bmath && Aenglish > Benglish) {
            System.out.println("1");
        } 
        else {
            System.out.println("0");
        }
    }
}