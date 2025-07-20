public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) { // 짝수 행: 1 2 3 4
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = j + 1;
                }
            } else { // 홀수 행: 4 3 2 1
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = 4 - j;
                }
            }
        }

        // 출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
