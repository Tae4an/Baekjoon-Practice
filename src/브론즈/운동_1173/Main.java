package 브론즈.운동_1173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int m = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();
        int R = scanner.nextInt();

        if (m + T > M) {
            System.out.println(-1); // 운동을 시작할 수 없는 경우
        } else {
            int time = 0;
            int exerciseTime = 0;
            int pulse = m;

            while (exerciseTime < N) {
                if (pulse + T <= M) {
                    pulse += T;
                    exerciseTime++;
                } else {
                    pulse = Math.max(pulse - R, m);
                }
                time++;
            }

            System.out.println(time);
        }

        scanner.close();
    }
}
