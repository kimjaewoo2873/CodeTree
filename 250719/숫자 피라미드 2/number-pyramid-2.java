import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int floor = 0;
        for(int i=1;i<=N;i++) { 
            floor = 0;
            for(int j=0;;j++) {
                cnt++;
                System.out.print(cnt + " ");
                floor++;
                if(floor == i)
                    break;
            }
            System.out.println();
        }
    }
}