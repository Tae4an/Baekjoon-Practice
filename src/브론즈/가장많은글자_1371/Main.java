package 브론즈.가장많은글자_1371;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[26]; // 알파벳별 출현 빈도를 저장할 배열
        int maxCount = 0; // 가장 많이 나온 글자의 출현 횟수

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') { // 알파벳 소문자인 경우
                    int index = c - 'a'; // 해당 알파벳의 인덱스 계산
                    count[index]++; // 해당 알파벳의 출현 횟수 증가
                    maxCount = Math.max(maxCount, count[index]); // 최대 출현 횟수 업데이트
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == maxCount) { // 가장 많이 나온 글자인 경우
                System.out.print((char) (i + 'a')); // 해당 글자 출력
            }
        }

        scanner.close();
    }
}
