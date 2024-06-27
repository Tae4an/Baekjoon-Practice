package 브론즈.노래악보_1392;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 악보 수
        int Q = scanner.nextInt(); // 질문의 개수
        int[] durations = new int[N]; // 각 악보의 시간

        // 악보의 시간을 입력받음
        for (int i = 0; i < N; i++) {
            durations[i] = scanner.nextInt();
        }

        // 각 질문에 대한 답변
        for (int i = 0; i < Q; i++) {
            int time = scanner.nextInt(); // 질문으로 주어진 시간
            int currentTime = 0; // 현재 시간
            int answer = 0; // 답변할 악보 번호

            // 악보 번호를 찾기 위해 각 악보의 시간을 더해감
            for (int j = 0; j < N; j++) {
                currentTime += durations[j];
                if (time < currentTime) {
                    answer = j + 1; // 0부터 시작하기 때문에 +1
                    break;
                }
            }
            System.out.println(answer);
        }

        scanner.close();
    }
}
