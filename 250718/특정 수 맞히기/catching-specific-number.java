import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int goal = 25;
        int input = 0;
        while(true) { 
            input = sc.nextInt();
            if(input < goal) {
                System.out.println("Higher");    
            } else if (input > goal) {
                System.out.println("Lower");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}