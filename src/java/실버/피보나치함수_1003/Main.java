package 실버.피보나치함수_1003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[][] dp = new int[41][2];

        dp[0][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
}
