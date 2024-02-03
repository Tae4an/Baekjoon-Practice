package 브론즈.모음의개수_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        while (true) {
            line = scanner.nextLine();
            if (line.equals("#")) break; // 입력의 끝을 나타내는 '#'이 입력되면 종료

            line = line.toLowerCase(); // 모든 입력을 소문자로 변환
            int count = 0; // 모음의 개수를 세는 변수

            // 각 문자에 대해 모음인지 확인
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            // 모음의 개수 출력
            System.out.println(count);
        }

        scanner.close();
    }
}
