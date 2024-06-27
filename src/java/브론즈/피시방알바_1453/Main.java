package 브론즈.피시방알바_1453;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 손님의 수
        boolean[] seats = new boolean[101]; // 피시방 자리, 1번부터 100번까지 사용
        int rejected = 0; // 거절당하는 사람의 수

        for (int i = 0; i < N; i++) {
            int seat = scanner.nextInt(); // 손님이 원하는 자리 번호
            if (seats[seat]) { // 해당 자리가 이미 차지되어 있다면
                rejected++; // 거절당하는 사람의 수 증가
            } else {
                seats[seat] = true; // 자리를 차지하고, 해당 자리를 차지했음을 표시
            }
        }

        System.out.println(rejected); // 거절당하는 사람의 수 출력
    }
}
