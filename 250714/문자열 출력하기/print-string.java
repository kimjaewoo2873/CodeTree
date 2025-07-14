public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String str = "LeebrosCode";

        int n = scanner.nextInt();
        
        if(n < 1 && n > 10){
            return;
        }

        for(int i=0; i<n; i++) {
            System.out.println(str);
        }
    }
}