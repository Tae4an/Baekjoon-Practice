package 브론즈.타임머신_1440;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String time = scanner.next();
        String[] parts = time.split(":");

        int possibleWays = 0;

        // 시, 분, 초를 각각 나타내는 부분을 배열로 저장
        int[] timeParts = new int[3];
        for (int i = 0; i < 3; i++) {
            timeParts[i] = Integer.parseInt(parts[i]);
        }

        // 가능한 모든 시간 조합을 검사
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    int k = 3 - i - j; // 남은 한 자리

                    // 시, 분, 초가 유효한 범위에 있는지 확인
                    if (isValidHour(timeParts[i]) && isValidMinuteOrSecond(timeParts[j]) && isValidMinuteOrSecond(timeParts[k])) {
                        possibleWays++;
                    }
                }
            }
        }

        System.out.println(possibleWays);
    }

    private static boolean isValidHour(int hour) {
        return hour >= 1 && hour <= 12;
    }

    private static boolean isValidMinuteOrSecond(int value) {
        return value >= 0 && value <= 59;
    }
}
