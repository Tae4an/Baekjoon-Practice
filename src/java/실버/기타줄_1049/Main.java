package 실버.기타줄_1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int minPackagePrice = Integer.MAX_VALUE;
        int minSinglePrice = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            int packagePrice = scanner.nextInt();
            int singlePrice = scanner.nextInt();
            if (packagePrice < minPackagePrice) {
                minPackagePrice = packagePrice;
            }
            if (singlePrice < minSinglePrice) {
                minSinglePrice = singlePrice;
            }
        }

        // 최소 비용 계산
        int costByPackages = (N / 6 + 1) * minPackagePrice; // 패키지만 구매하는 경우
        int costBySingles = N * minSinglePrice; // 낱개만 구매하는 경우
        int costByMixed = (N / 6) * minPackagePrice + (N % 6) * minSinglePrice; // 혼합 구매하는 경우

        int minCost = Math.min(Math.min(costByPackages, costBySingles), costByMixed);
        System.out.println(minCost);
    }
}
