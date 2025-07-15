import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if((A < -100 && A > 100) || (B < -100 && B > 100) || (C < -100 && C > 100) || 
        (A == B) || (B == C) || (A == C)) { 
            return;
        } 
        else {
            if(A <= B && A >= C) {
                System.out.println(A);
            }
            else if(A <= C && A >= B) {
                System.out.println(A);
            } 
            else if(B <= A && B >= C) { 
                System.out.println(B);
            }
            else if(B <= C && B >= A) {
                System.out.println(B);
            }
            else if(C <= A && C >= B) {
                System.out.println(C);
            }
            else if(C <= B && C >= A) {
                System.out.println(C);
            }
        }
    }
}