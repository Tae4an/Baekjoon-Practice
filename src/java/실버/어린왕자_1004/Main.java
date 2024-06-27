package 실버.어린왕자_1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수

        for (int t = 0; t < T; t++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int n = scanner.nextInt(); // 행성계의 수

            int count = 0;

            for (int i = 0; i < n; i++) {
                int cx = scanner.nextInt();
                int cy = scanner.nextInt();
                int r = scanner.nextInt();

                boolean startInside = isInCircle(x1, y1, cx, cy, r);
                boolean endInside = isInCircle(x2, y2, cx, cy, r);

                // 출발점과 도착점이 원의 내부와 외부에 각각 위치할 때만 카운트를 증가
                if (startInside != endInside) {
                    count++;
                }
            }

            System.out.println(count);
        }
        scanner.close();
    }

    // 주어진 점 (x, y)가 중심 (cx, cy)과 반지름 r을 가진 원 안에 있는지 판단하는 메소드
    private static boolean isInCircle(int x, int y, int cx, int cy, int r) {
        int distSquared = (x - cx) * (x - cx) + (y - cy) * (y - cy);
        return distSquared < r * r;
    }
}
