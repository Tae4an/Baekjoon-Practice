package 브론즈.영식이와친구들_1592;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 사람 수
        int M = scanner.nextInt(); // 공을 M번 받으면 게임이 끝남
        int L = scanner.nextInt(); // 공을 던질 때 이동할 거리

        int[] receiveCounts = new int[N]; // 각 사람이 공을 받은 횟수를 저장하는 배열
        int current = 0; // 현재 공을 가진 사람의 위치
        int throwsCount = 0; // 공을 던진 횟수

        while (true) {
            receiveCounts[current]++; // 현재 사람이 공을 받음
            if (receiveCounts[current] == M) break; // 공을 M번 받으면 게임 종료

            if (receiveCounts[current] % 2 == 1) { // 받은 횟수가 홀수면 시계 방향으로 L번째 사람에게 던짐
                current = (current + L) % N;
            } else { // 받은 횟수가 짝수면 반시계 방향으로 L번째 사람에게 던짐
                current = (current - L + N) % N;
            }
            throwsCount++; // 공을 던진 횟수 증가
        }

        System.out.println(throwsCount); // 공을 던진 총 횟수 출력
    }
}
