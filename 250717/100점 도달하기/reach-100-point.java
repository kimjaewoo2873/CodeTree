import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 0 || N > 100) 
            return;
        int score = N;
        for(int i=N;i<=100;i++) {
            if(score < 60) {
                System.out.print("F ");
            } else if(score >= 60 && score < 70){
                System.out.print("D ");
            } else if(score >= 70 && score < 80){
                System.out.print("C ");
            } else if(score >= 80 && score < 90){
                System.out.print("B ");
            } else {
                System.out.print("A ");
            }
            score++;
        }
    }
}