package 브론즈.생장점_1703;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            if (a == 0) break; // 입력의 마지막 줄 처리

            int leaves = 1; // 초기 나뭇잎의 수

            for (int i = 0; i < a; i++) {
                int splittingFactor = scanner.nextInt(); // 분할 인자
                int prunedBranches = scanner.nextInt(); // 가지치기로 제거된 가지의 수

                leaves *= splittingFactor; // 분할 인자로 나뭇잎의 수 증가
                leaves -= prunedBranches; // 제거된 가지의 나뭇잎 수만큼 감소
            }

            System.out.println(leaves); // 최종 나뭇잎의 수 출력
        }

        scanner.close();
    }
}
