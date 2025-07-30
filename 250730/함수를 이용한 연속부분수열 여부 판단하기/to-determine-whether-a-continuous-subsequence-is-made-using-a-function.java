import java.util.Scanner;
public class Main {
    public static void fun(int a[], int b[]) {
        boolean flag = true;
        for(int i=0;i<=a.length - b.length;i++) {
            flag = true;
            for(int j=0;j<b.length;j++) {
                if(a[i + j] != b[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        fun(a, b);
    }
}