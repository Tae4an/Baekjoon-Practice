package 브론즈.가장큰금민수_1526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (!isGeumminsu(N)) {
            N--;
        }
        System.out.println(N);
    }

    // 숫자가 금민수인지 확인하는 함수
    private static boolean isGeumminsu(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
