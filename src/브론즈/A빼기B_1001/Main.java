package 브론즈.A빼기B_1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int sum = A - B;

        System.out.println(sum);
    }
}