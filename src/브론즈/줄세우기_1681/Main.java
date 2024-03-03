package 브론즈.줄세우기_1681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.close();

        int label = 1; // 라벨링 시작 숫자
        int count = 0; // 현재까지 라벨링된 학생 수

        while (count < N) {
            // 현재 라벨에 L이 포함되어 있지 않다면 학생에게 라벨링
            if (!String.valueOf(label).contains(String.valueOf(L))) {
                count++;
                if (count == N) break; // N명의 학생에게 모두 라벨링 했다면 반복 종료
            }
            label++; // 다음 라벨로 이동
        }

        // 라벨링한 학생들 중 가장 큰 수 출력
        System.out.println(label);
    }
}
