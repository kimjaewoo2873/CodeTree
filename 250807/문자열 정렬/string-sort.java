import java.util.Scanner;
public class Main {
    public static void asc(String s) {
        char arr[] = s.toCharArray();
        char c;
        
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<s.length();j++) {
                if(arr[i] > arr[j]) {
                    c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        String str = new String(arr);
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        asc(s);
    }
}