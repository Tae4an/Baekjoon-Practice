package 브론즈._2007년_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        // 각 월별 일수를 배열로 관리
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 월요일부터 시작하므로, 인덱스 0은 월요일
        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        // 1월 1일부터 x월 y일까지의 총 일수 계산
        int totalDays = 0;
        for (int i = 0; i < x - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += (y - 1); // 1월 1일을 포함하기 때문에 y-1을 더한다.
        
        // 요일 계산
        String resultDay = daysOfWeek[totalDays % 7];
        
        // 결과 출력
        System.out.println(resultDay);
    }
}
