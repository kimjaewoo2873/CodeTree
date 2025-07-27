import java.util.Scanner;

public class Main {
    public static int findFactor(int n, int m) {
        int maxSize = n * m;
        int narr[] = new int[maxSize/n];
        int marr[] = new int[maxSize/m];
        for(int i=1;i<narr.length;i++){
            narr[i - 1] = n * i;
        }
        for(int i=1;i<marr.length;i++){
            marr[i - 1] = m * i;
        }
        for(int i=0;i<narr.length;i++){
            for(int j=0;j<marr.length;j++){
                if(narr[i] == marr[j])
                    return narr[i];
            }
        }
        return n*m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int factor = findFactor(n, m);
        System.out.println(factor);
    }
}