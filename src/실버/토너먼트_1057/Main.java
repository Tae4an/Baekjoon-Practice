package 실버.토너먼트_1057;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int jimin = scanner.nextInt();
        int hansoo = scanner.nextInt();

        int round = 1; // 대결하는 라운드 수
        while (true) {
            // 두 선수가 대결하게 될 라운드를 찾는 조건
            if ((jimin + 1) / 2 == (hansoo + 1) / 2) {
                System.out.println(round);
                return;
            }
            
            // 선수들의 위치를 다음 라운드 위치로 업데이트
            jimin = (jimin + 1) / 2;
            hansoo = (hansoo + 1) / 2;
            round++;
        }
    }
}
