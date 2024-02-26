package 브론즈.새_1568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 새의 수 N 입력 받기
        int N = scanner.nextInt();

        int seconds = 0; // 총 걸린 시간(초) 초기화
        int k = 1; // 노래하는 숫자 초기화

        while (N > 0) {
            if (k > N) {
                // 현재 남아있는 새의 수가 노래해야 하는 수보다 작으면 1부터 다시 시작
                k = 1;
            }
            N -= k; // k마리의 새가 날아감
            seconds++; // 시간(초) 증가
            k++; // 다음 숫자로 업데이트
        }

        // 모든 새가 날아가는데 걸린 총 시간(초) 출력
        System.out.println(seconds);
    }
}
