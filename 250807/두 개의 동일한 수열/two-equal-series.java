import java.util.Scanner;
public class Main {
    public static boolean fun(int a[], int b[]) {
        boolean flag = false;
        for(int i=0;i<a.length;i++) {
            flag = false;
            for(int j=0;j<b.length;j++) {
                if(a[i] == b[j]){
                    flag = true; 
                }
            }
            if(!flag) 
                return false;
        }
        return true;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        if(fun(a, b))
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}