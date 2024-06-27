package 브론즈.수열의변화_1551;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N과 K 입력 받기
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // 숫자 입력 후 개행문자 처리

        // 수열 A 입력 받기
        String[] input = scanner.nextLine().split(",");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        // K번 변형 과정 수행
        for (int k = 0; k < K; k++) {
            int[] B = new int[A.length - 1];
            for (int i = 0; i < A.length - 1; i++) {
                B[i] = A[i + 1] - A[i];
            }
            A = B; // B를 A로 업데이트하여 다음 변형을 위해 준비
        }

        // 결과 출력
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1) System.out.print(",");
        }
    }
}
