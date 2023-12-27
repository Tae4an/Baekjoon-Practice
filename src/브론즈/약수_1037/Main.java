package 브론즈.약수_1037;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDivisors = scanner.nextInt(); // 진짜 약수의 개수
        int[] divisors = new int[numberOfDivisors];

        for (int i = 0; i < numberOfDivisors; i++) {
            divisors[i] = scanner.nextInt(); // 진짜 약수 입력
        }

        // 최소값과 최대값을 찾아서 곱함
        Arrays.sort(divisors);
        int N = divisors[0] * divisors[numberOfDivisors - 1];

        System.out.println(N);

        scanner.close();
    }
}

