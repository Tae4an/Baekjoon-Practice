package 브론즈.펫_1362;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scenario = 1;

        while (true) {
            int o = scanner.nextInt(); // 적정 체중
            int w = scanner.nextInt(); // 실제 체중
            if (o == 0 && w == 0) break; // 입력 종료 조건

            boolean isDead = false;

            while (true) {
                char action = scanner.next().charAt(0); // 'E' 또는 'F'
                int n = scanner.nextInt(); // 작용량
                if (action == '#' && n == 0) break; // 시나리오 종료 조건

                if (!isDead) {
                    if (action == 'E') {
                        w -= n; // 운동으로 체중 감소
                    } else if (action == 'F') {
                        w += n; // 먹이로 체중 증가
                    }

                    if (w <= 0) isDead = true; // 사망 판정
                }
            }

            System.out.print(scenario + " ");
            if (isDead) {
                System.out.println("RIP");
            } else if (w > o / 2 && w < o * 2) {
                System.out.println(":-)");
            } else {
                System.out.println(":-(");
            }

            scenario++;
        }

        scanner.close();
    }
}
