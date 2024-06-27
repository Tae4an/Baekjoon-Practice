package 브론즈.논리학교수_1813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] statements = new int[N];
        for (int i = 0; i < N; i++) {
            statements[i] = scanner.nextInt();
        }

        int maxTrue = -1;
        for (int trueCount = 0; trueCount <= N; trueCount++) {
            int count = 0;
            for (int statement : statements) {
                if (statement == trueCount) {
                    count++;
                }
            }
            if (count == trueCount) {
                maxTrue = Math.max(maxTrue, trueCount);
            }
        }

        System.out.println(maxTrue);
    }
}
