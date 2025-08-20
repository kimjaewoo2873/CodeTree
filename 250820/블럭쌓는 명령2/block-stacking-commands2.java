import java.util.Scanner;
public class Main {
    public static int operation(int line[], int times[][]) {
        for(int i=0;i<line.length;i++) {
            line[i] = 0;
        }

        for(int i=0;i<times.length;i++) {
            int start = times[i][0];
            int end = times[i][1];
            line[start] += 1;
            line[end] += 1;
        }

        int max = line[0];
        for(int i=1;i<line.length;i++) {
            if(max < line[i]) {
                max = line[i]; 
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int times[][] = new int[K][2];
        int line [] = new int[N];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            times[i][0] = A;
            times[i][1] = B;
        }
        System.out.println(operation(line, times));
    }
}