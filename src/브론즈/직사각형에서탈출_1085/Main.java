package 브론즈.직사각형에서탈출_1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int distanceToTop = h - y;
        int distanceToBottom = y;
        int distanceToRight = w - x;
        int distanceToLeft = x;

        int minDistance = Math.min(Math.min(distanceToTop, distanceToBottom), Math.min(distanceToRight, distanceToLeft));

        System.out.println(minDistance);
    }
}
