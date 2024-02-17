package 브론즈._2진수8진수_1373;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine(); // 2진수 입력
        StringBuilder octal = new StringBuilder(); // 8진수를 저장할 StringBuilder

        // 2진수의 길이가 3의 배수가 되도록 앞에 0을 채움
        int padding = 3 - binary.length() % 3;
        if (padding != 3) { // 길이가 이미 3의 배수라면 패딩 불필요
            for (int i = 0; i < padding; i++) {
                binary = "0" + binary;
            }
        }

        // 3자리씩 끊어서 8진수로 변환
        for (int i = 0; i < binary.length(); i += 3) {
            int octDigit = (binary.charAt(i) - '0') * 4 + (binary.charAt(i + 1) - '0') * 2 + (binary.charAt(i + 2) - '0');
            octal.append(octDigit);
        }

        System.out.println(octal.toString()); // 8진수 출력
        scanner.close();
    }
}
