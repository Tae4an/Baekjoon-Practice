package 브론즈.최소공배수_1934;

import java.util.Scanner;

public class Main {
    // 최대공약수를 계산하는 함수 (유클리드 호제법)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소공배수를 계산하는 함수
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(lcm(A, B));
        }

        scanner.close();
    }
}
