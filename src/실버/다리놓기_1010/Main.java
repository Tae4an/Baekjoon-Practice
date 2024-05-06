package 실버.다리놓기_1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // 서쪽의 사이트 개수
            int M = scanner.nextInt(); // 동쪽의 사이트 개수

            // 동쪽의 M개 사이트에서 서쪽의 N개를 선택하는 경우의 수를 계산하여 출력
            System.out.println(combination(M, N));
        }

        scanner.close();
    }

    // 조합(combination)을 계산하는 함수
    private static long combination(int n, int r) {
        long[][] dp = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[n][r];
    }
}