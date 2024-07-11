package java.브론즈.도비의영어공부_2386;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 입력 받기
            String line = scanner.nextLine();

            // 입력의 마지막 줄이 '#'인지 확인
            if (line.equals("#")) {
                break;
            }

            // 첫 번째 입력은 카운트할 알파벳
            char targetChar = line.charAt(0);
            // 나머지 입력은 문장
            String sentence = line.substring(2);

            // 알파벳의 소문자와 대문자를 모두 포함하여 세기 위해서 모두 소문자로 변환
            targetChar = Character.toLowerCase(targetChar);
            sentence = sentence.toLowerCase();

            int count = 0;
            // 문장에서 해당 알파벳 세기
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == targetChar) {
                    count++;
                }
            }

            // 결과 출력
            System.out.println(targetChar + " " + count);
        }

        scanner.close();
    }
}
