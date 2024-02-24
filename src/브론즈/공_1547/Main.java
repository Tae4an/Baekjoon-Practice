package 브론즈.공_1547;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt(); // 컵 위치를 바꾼 횟수
        int ballPosition = 1; // 처음에 공은 1번 컵 아래에 있음

        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt(); // 위치를 바꿀 컵 X
            int Y = scanner.nextInt(); // 위치를 바꿀 컵 Y

            // 공이 있는 컵의 위치를 바꿀 경우, 공의 위치도 업데이트
            if (ballPosition == X) {
                ballPosition = Y;
            } else if (ballPosition == Y) {
                ballPosition = X;
            }
            // 공이 X나 Y에 없는 경우, 위치는 변경되지 않으므로 업데이트할 필요 없음
        }

        // 최종적으로 공이 있는 컵의 번호 출력
        System.out.println(ballPosition);
    }
}
