import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void asc(String [] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordList = new String[n];
        for (int i = 0; i < n; i++) {
            wordList[i] = sc.next();
        }
        // Please write your code here.
        asc(wordList);
    }
}