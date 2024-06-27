package 브론즈.임시반장정하기_1268;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 학생 수
        int[][] classes = new int[N][5]; // 학생들의 1~5학년 반 정보

        // 학생들의 반 정보 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                classes[i][j] = scanner.nextInt();
            }
        }

        int leader = 0; // 임시 반장의 번호
        int maxSameClass = 0; // 가장 많은 동급생과 같은 반이었던 횟수

        // 각 학생을 기준으로 다른 학생들과 같은 반이었던 횟수 계산
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        count++;
                        break; // 한 번이라도 같은 반이었다면 카운트하고 다음 학생으로
                    }
                }
            }

            // 같은 반이었던 횟수가 현재까지의 최대값보다 크면 정보 갱신
            if (count > maxSameClass) {
                maxSameClass = count;
                leader = i + 1; // 학생 번호는 1부터 시작
            }
        }

        // 임시 반장의 번호 출력
        System.out.println(leader);
        scanner.close();
    }
}
