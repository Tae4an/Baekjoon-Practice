package 브론즈.이상한곱셈_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        long result = 0;

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                result += (A.charAt(i) - '0') * (B.charAt(j) - '0');
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
