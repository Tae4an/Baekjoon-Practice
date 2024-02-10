package 브론즈.유진수_1356;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String nStr = String.valueOf(n); // 숫자를 문자열로 변환

        boolean isEugeneNumber = false;

        for (int i = 1; i < nStr.length(); i++) {
            // 가능한 모든 방법으로 수를 두 부분으로 나눔
            String front = nStr.substring(0, i);
            String back = nStr.substring(i);

            // 앞부분과 뒷부분의 자리수의 곱 계산
            long frontProduct = 1;
            for (char digit : front.toCharArray()) {
                frontProduct *= Character.getNumericValue(digit);
            }

            long backProduct = 1;
            for (char digit : back.toCharArray()) {
                backProduct *= Character.getNumericValue(digit);
            }

            // 앞부분과 뒷부분의 곱이 같은 경우
            if (frontProduct == backProduct) {
                isEugeneNumber = true;
                break;
            }
        }

        System.out.println(isEugeneNumber ? "YES" : "NO");
        scanner.close();
    }
}
