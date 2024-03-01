package 브론즈.꼬리를무는숫자나열_1598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        // 숫자 위치 계산 (0부터 시작하는 위치를 고려하여 -1 처리)
        int firstCol = (firstNum - 1) / 4;
        int firstRow = (firstNum - 1) % 4;
        int secondCol = (secondNum - 1) / 4;
        int secondRow = (secondNum - 1) % 4;

        // 직각거리 계산
        int distance = Math.abs(firstCol - secondCol) + Math.abs(firstRow - secondRow);

        System.out.println(distance);
    }
}
