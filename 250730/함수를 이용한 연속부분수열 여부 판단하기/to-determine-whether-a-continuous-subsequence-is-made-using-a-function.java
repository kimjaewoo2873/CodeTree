import java.util.Scanner;
public class Main {
    public static void fun(int a[], int b[]) {
        boolean flag = false;
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<b.length;j++) {
                if(a[i] == b[j]) {
                    int eq = i;
                    for(int k=j + 1; k<b.length; k++) {
                        if(a[++i] != b[k]) {
                            break;
                        } 
                        else {
                            flag = true;
                        }
                    }
                }
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