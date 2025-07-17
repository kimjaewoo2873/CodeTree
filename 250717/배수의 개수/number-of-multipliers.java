import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int sum3 = 0;
        int sum5 = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] % 3 == 0)
                sum3++;
            if(arr[i] % 5 == 0)
                sum5++;
        }
        System.out.println(sum3 + " " + sum5);
    }
}