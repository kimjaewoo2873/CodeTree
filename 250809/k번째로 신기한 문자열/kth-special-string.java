import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void fun(int n, int k, String t, String []words) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> rest = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            if(words[i].startsWith(t)) {
                result.add(words[i]);
            }
        }
        
        Collections.sort(result);
       

        System.out.println(result.get(k - 1));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        fun(n, k, t, words);
    }
}