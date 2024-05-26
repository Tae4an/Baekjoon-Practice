package 실버.게임_1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        long Z = Y * 100 / X;  // 현재 승률 계산

        if (Z >= 99) {
            System.out.println(-1);
        } else {
            long low = 1;
            long high = 2000000000;  // 충분히 큰 수 설정
            long result = high;

            while (low <= high) {
                long mid = (low + high) / 2;
                long newZ = (Y + mid) * 100 / (X + mid);

                if (newZ > Z) {  // 승률 변화가 있을 경우
                    result = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(result);
        }
    }
}
