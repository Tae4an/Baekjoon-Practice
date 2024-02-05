package 브론즈.TV크기_1297;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt(); // TV의 대각선 길이
        int H = scanner.nextInt(); // TV의 높이 비율
        int W = scanner.nextInt(); // TV의 너비 비율

        // 실제 높이와 너비 비율을 계산
        double x = D / Math.sqrt(H * H + W * W);
        int actualHeight = (int)(x * H); // 실제 높이
        int actualWidth = (int)(x * W); // 실제 너비

        // 실제 높이와 너비 출력
        System.out.println(actualHeight + " " + actualWidth);

        scanner.close();
    }
}
