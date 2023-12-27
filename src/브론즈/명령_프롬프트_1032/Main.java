package 브론즈.명령_프롬프트_1032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 파일 개수
        scanner.nextLine(); // 개행 문자 처리

        String[] files = new String[N];
        for (int i = 0; i < N; i++) {
            files[i] = scanner.nextLine(); // 파일 이름 입력
        }

        // 패턴 찾기
        String pattern = findPattern(files);
        System.out.println(pattern);

        scanner.close();
    }

    // 공통 패턴 찾는 메소드
    static String findPattern(String[] files) {
        StringBuilder pattern = new StringBuilder(files[0]); // 첫 번째 파일 이름으로 초기화

        for (int i = 1; i < files.length; i++) {
            for (int j = 0; j < files[i].length(); j++) {
                if (pattern.charAt(j) != files[i].charAt(j)) {
                    pattern.setCharAt(j, '?'); // 다른 문자 발견 시 '?'로 변경
                }
            }
        }

        return pattern.toString();
    }
}
