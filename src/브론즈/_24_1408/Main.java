package 브론즈._24_1408;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] currentTime = scanner.nextLine().split(":"); // 현재 시간 입력
        String[] startTime = scanner.nextLine().split(":"); // 임무 시작 시간 입력

        int currentSeconds = toSeconds(currentTime); // 현재 시간을 초 단위로 변환
        int startSeconds = toSeconds(startTime); // 시작 시간을 초 단위로 변환
        int remainingSeconds;

        if (currentSeconds < startSeconds) {
            // 임무 시작 시간이 현재 시간보다 미래인 경우
            remainingSeconds = startSeconds - currentSeconds;
        } else {
            // 임무 시작 시간이 현재 시간보다 과거인 경우
            remainingSeconds = 24 * 60 * 60 - (currentSeconds - startSeconds);
        }

        System.out.println(toHHMMSS(remainingSeconds)); // 남은 시간을 "HH:MM:SS" 형태로 출력
        scanner.close();
    }

    // 시간, 분, 초를 초 단위로 변환하는 함수
    private static int toSeconds(String[] time) {
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }

    // 초 단위를 "HH:MM:SS" 형태로 변환하는 함수
    private static String toHHMMSS(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}
