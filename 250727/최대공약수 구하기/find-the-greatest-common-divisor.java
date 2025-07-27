import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int min = 0;
        int factor = 0;
        if(n > m) 
            min = m;
        else if(n < m)
            min = n;
        else if(n == m) 
            min = n;
        for(int i=1;i<=min;i++){
            if(n % i == 0 && m % i == 0){
                factor = i;
            }
        }
        System.out.println(factor);
    }
}