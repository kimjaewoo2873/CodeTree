import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int f(int n, int nums[]) {
        Arrays.sort(nums);
        int max = 0;
        int cur = 0;
        for(int i=0;i<n;i++) {
            cur = nums[i] + nums[n * 2 - 1 - i]; // 하나씩 줄어들어야함
            if(cur > max)
                max = cur;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.

        System.out.println(f(n, nums));
    }
}