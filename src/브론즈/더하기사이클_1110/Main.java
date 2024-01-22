package 브론즈.더하기사이클_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cycleLength = 0;
        int newNumber = N;

        do {
            int firstDigit = newNumber / 10;
            int secondDigit = newNumber % 10;
            int sum = firstDigit + secondDigit;
            newNumber = (secondDigit * 10) + (sum % 10);
            cycleLength++;
        } while (newNumber != N);

        System.out.println(cycleLength);

        scanner.close();
    }
}
