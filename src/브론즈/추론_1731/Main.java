package 브론즈.추론_1731;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 수열의 길이 입력
        int[] sequence = new int[N]; // 수열 저장 배열

        // 수열 입력 받기
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        // 등차수열과 등비수열 판별
        if (sequence[1] - sequence[0] == sequence[2] - sequence[1]) {
            // 등차수열의 경우
            int difference = sequence[1] - sequence[0]; // 차이 계산
            System.out.println(sequence[N - 1] + difference); // 다음 수 출력
        } else {
            // 등비수열의 경우
            int ratio = sequence[1] / sequence[0]; // 비율 계산
            System.out.println(sequence[N - 1] * ratio); // 다음 수 출력
        }

        scanner.close();
    }
}
