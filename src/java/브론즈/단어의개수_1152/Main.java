package 브론즈.단어의개수_1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim(); // 문자열의 앞뒤 공백 제거
        if (input.isEmpty()) {
            System.out.println(0); // 문자열이 공백인 경우
        } else {
            String[] words = input.split("\\s+"); // 공백으로 단어 분리
            System.out.println(words.length); // 단어의 개수 출력
        }

        scanner.close();
    }
}
