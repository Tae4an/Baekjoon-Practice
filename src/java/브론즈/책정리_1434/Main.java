package 브론즈.책정리_1434;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 박스의 개수
        int M = sc.nextInt(); // 책의 개수
        int[] boxes = new int[N];
        int[] books = new int[M];

        // 박스 용량 입력
        for (int i = 0; i < N; i++) {
            boxes[i] = sc.nextInt();
        }

        // 책 크기 입력
        for (int i = 0; i < M; i++) {
            books[i] = sc.nextInt();
        }

        int boxIndex = 0; // 현재 박스 인덱스
        int bookIndex = 0; // 현재 책 인덱스
        int wastedCapacity = 0; // 낭비된 용량 합계

        while (bookIndex < M && boxIndex < N) {
            if (boxes[boxIndex] >= books[bookIndex]) {
                // 현재 박스에 책을 넣을 수 있는 경우
                boxes[boxIndex] -= books[bookIndex];
                bookIndex++;
            } else {
                // 현재 박스에 책을 넣을 수 없는 경우
                wastedCapacity += boxes[boxIndex]; // 낭비된 용량 추가
                boxIndex++; // 다음 박스로 이동
            }
        }

        // 남은 박스의 용량 합산
        for (; boxIndex < N; boxIndex++) {
            wastedCapacity += boxes[boxIndex];
        }

        System.out.println(wastedCapacity); // 낭비된 용량 합계 출력
        sc.close();
    }
}
