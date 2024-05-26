package 실버.막대기_1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int count = 0;  // 필요한 막대의 개수
        while (X > 0) {
            if (X % 2 == 1) {
                count++;
            }
            X /= 2;
        }

        System.out.println(count);
    }
}
