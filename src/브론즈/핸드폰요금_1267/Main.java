package 브론즈.핸드폰요금_1267;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 통화의 개수
        int[] calls = new int[N]; // 통화 시간 목록

        for (int i = 0; i < N; i++) {
            calls[i] = scanner.nextInt(); // 통화 시간 입력
        }

        int yCost = 0; // 영식 요금제 총 요금
        int mCost = 0; // 민식 요금제 총 요금

        for (int time : calls) {
            yCost += ((time / 30) + 1) * 10; // 영식 요금제 요금 계산
            mCost += ((time / 60) + 1) * 15; // 민식 요금제 요금 계산
        }

        // 더 저렴한 요금제와 요금 출력
        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (mCost < yCost) {
            System.out.println("M " + mCost);
        } else { // 요금이 같은 경우
            System.out.println("Y M " + yCost);
        }

        scanner.close();
    }
}
