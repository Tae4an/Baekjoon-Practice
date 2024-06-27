package 브론즈.폭죽쇼_1773;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 폭죽을 터뜨리는 학생 수
        int C = scanner.nextInt(); // 폭죽쇼가 끝나는 시간
        boolean[] fireworks = new boolean[C + 1]; // 폭죽이 터지는 시간을 기록할 배열

        for (int i = 0; i < N; i++) {
            int period = scanner.nextInt(); // 학생별 폭죽을 터뜨리는 주기
            for (int j = period; j <= C; j += period) {
                fireworks[j] = true; // 주기별로 폭죽이 터지는 시간을 true로 설정
            }
        }

        // 폭죽이 터지는 시간을 센다
        int result = 0;
        for (int i = 1; i <= C; i++) {
            if (fireworks[i]) {
                result++;
            }
        }

        System.out.println(result); // 결과 출력
        scanner.close();
    }
}
