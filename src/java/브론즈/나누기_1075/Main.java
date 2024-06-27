package 브론즈.나누기_1075;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int F = scanner.nextInt();

        N = (N / 100) * 100;

        while (N % F != 0) {
            N++;
        }
        System.out.format("%02d", N % 100);
    }
}
