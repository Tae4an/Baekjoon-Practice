package 브론즈.이진수덧셈_1252;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 이진수 입력 받기
        String binary1 = scanner.next();
        String binary2 = scanner.next();

        // BigInteger로 변환 (radix 2는 이진수를 의미)
        BigInteger num1 = new BigInteger(binary1, 2);
        BigInteger num2 = new BigInteger(binary2, 2);

        // 두 이진수 덧셈
        BigInteger sum = num1.add(num2);

        // 결과를 이진수 문자열로 변환하여 출력
        System.out.println(sum.toString(2));

        scanner.close();
    }
}
