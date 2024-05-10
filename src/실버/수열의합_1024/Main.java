package 실버.수열의합_1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();

        for (int length = L; length <= 100; length++) {
            long temp = N - (length * (length - 1) / 2);
            if (temp >= 0 && temp % length == 0) {
                int a = (int) (temp / length);
                for (int i = 0; i < length; i++) {
                    System.out.print((a + i) + " ");
                }
                System.out.println();
                return;
            }
        }
        System.out.println(-1);
    }
}
