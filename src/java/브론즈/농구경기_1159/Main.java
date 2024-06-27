package 브론즈.농구경기_1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // 숫자 입력 후 줄바꿈 처리

        int[] count = new int[26]; // 알파벳 26개에 대한 카운트 배열
        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            count[name.charAt(0) - 'a']++; // 성의 첫 글자에 대한 카운트
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] >= 5) {
                result.append((char) (i + 'a')); // 5번 이상 나타난 글자 추가
            }
        }

        System.out.println(result.length() > 0 ? result.toString() : "PREDAJA");

        scanner.close();
    }
}
