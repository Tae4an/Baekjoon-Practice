package 브론즈.뒤집힌덧셈_1357;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(); // 수 X 입력
        int Y = scanner.nextInt(); // 수 Y 입력

        int revX = reverse(X); // X의 자리수를 역순으로 만듦
        int revY = reverse(Y); // Y의 자리수를 역순으로 만듦

        int sumRev = reverse(revX + revY); // 두 수의 합을 역순으로 만듦

        System.out.println(sumRev); // 결과 출력
        scanner.close();
    }

    // 주어진 수의 자리수를 역순으로 만드는 함수
    public static int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10; // 마지막 자리수를 reversed의 다음 자리로 이동
            number /= 10; // number의 마지막 자리수 제거
        }
        return reversed;
    }
}
