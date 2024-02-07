package 브론즈.쉽게푸는문제_1292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 구간 시작
        int B = scanner.nextInt(); // 구간 끝

        int sum = 0; // 구간의 합을 저장할 변수
        int currentNumber = 1; // 현재 숫자
        int count = 0; // 현재 숫자가 몇 번 나왔는지 세는 카운터

        for (int i = 1; i <= B; i++) { // 1부터 B까지 반복
            if (i >= A) { // i가 A와 같거나 크면 합에 추가
                sum += currentNumber;
            }
            count++;
            if (count == currentNumber) { // 현재 숫자가 해당 숫자만큼 나왔다면, 다음 숫자로 넘어감
                currentNumber++;
                count = 0;
            }
        }

        System.out.println(sum); // 구간의 합 출력
        scanner.close();
    }
}
