import java.util.Scanner;
public class Main {
    public static String fun(String A) {
        int cnt = 0;
        for(int i=0; i<A.length() - 1; i++) {
            char c1 = A.charAt(i);
            char c2 = A.charAt(i + 1);
            if(c1 != c2) {
                cnt++;
            }
            if(cnt >= 2) {
                break;
            } 
        }
        return cnt >= 2 ? "Yes" : "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.println(fun(A));
    }
}