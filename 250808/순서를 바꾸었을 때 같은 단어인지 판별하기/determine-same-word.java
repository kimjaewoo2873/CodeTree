import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static boolean fun(String word1, String word2) {
        char ar1[] = word1.toCharArray();
        char ar2[] = word2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        if(ar1.length != ar2.length) {
            return false;
        }
        
        for(int i=0;i<ar1.length;i++){
            if(ar1[i] != ar2[i]) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        if(fun(word1, word2))
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}