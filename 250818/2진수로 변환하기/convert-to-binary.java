import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void findBinary(int n) {
        ArrayList<Integer> list = new ArrayList<>();
    
        while (true) { 
            if(n <= 2) {
                list.add(n % 2);
                break;
            }
            else {
                list.add(n % 2);
                n /= 2;
            }
        }
        
        for(int i = list.size() - 1; i >= 0; i--) {
             System.out.print(list.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findBinary(n);
    }
}