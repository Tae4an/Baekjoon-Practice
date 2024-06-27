package 브론즈.대소문자바꾸기_2744;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // 입력받은 단어
        StringBuilder result = new StringBuilder(); // 변환된 단어를 저장할 StringBuilder

        // 각 문자를 확인하고 변환
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                // 소문자라면 대문자로 변환
                result.append(Character.toUpperCase(ch));
            } else {
                // 대문자라면 소문자로 변환
                result.append(Character.toLowerCase(ch));
            }
        }

        // 결과 출력
        System.out.println(result.toString());
        scanner.close();
    }
}
