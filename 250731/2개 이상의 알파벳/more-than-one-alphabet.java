import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static String fun(String A) {
        HashSet<Character> hash = new HashSet<>();
    
        for(int i=0; i<A.length(); i++) {
            hash.add(A.charAt(i));
            if(hash.size() >= 2) {
                break;
            }
        }
        
        return hash.size() >= 2 ? "Yes" : "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.println(fun(A));
    }
}