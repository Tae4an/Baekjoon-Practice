package 브론즈.단어공부_1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toUpperCase(); // 모든 문자를 대문자로 변환
        int[] count = new int[26]; // 알파벳 개수만큼의 배열 생성 (A-Z)

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'A']++; // 각 문자의 출현 횟수를 세기
        }

        int maxCount = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = (char) (i + 'A'); // 가장 많이 출현한 알파벳
            } else if (count[i] == maxCount) {
                result = '?'; // 동일한 최대 출현 횟수가 있을 경우 '?'
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
