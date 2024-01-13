package 브론즈.분산처리_1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 T를 입력받음
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            // 각 테스트 케이스에 대한 a와 b를 입력받음
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // 마지막 데이터가 처리되는 컴퓨터 번호를 계산
            int lastComputer = findLastComputer(a, b);

            // 결과 출력
            System.out.println(lastComputer);
        }

        // Scanner 객체를 닫음
        scanner.close();
    }

    // 마지막 데이터가 처리되는 컴퓨터 번호를 찾는 함수
    private static int findLastComputer(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % 10;
        }
        return result == 0 ? 10 : result;
    }
}
