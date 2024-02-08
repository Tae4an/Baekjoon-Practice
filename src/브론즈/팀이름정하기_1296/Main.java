package 브론즈.팀이름정하기_1296;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yeonduName = scanner.nextLine(); // 연두의 이름 입력
        int N = Integer.parseInt(scanner.nextLine()); // 팀 이름 후보의 개수 입력
        String bestTeamName = ""; // 우승할 확률이 가장 높은 팀 이름
        int maxProbability = -1; // 가장 높은 확률

        for (int i = 0; i < N; i++) {
            String teamName = scanner.nextLine(); // 팀 이름 후보 입력
            // 연두의 이름과 팀 이름에서 L, O, V, E의 개수 계산
            int L = countChar(yeonduName + teamName, 'L');
            int O = countChar(yeonduName + teamName, 'O');
            int V = countChar(yeonduName + teamName, 'V');
            int E = countChar(yeonduName + teamName, 'E');
            // 공식에 따른 우승 확률 계산
            int probability = (((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100);

            // 가장 높은 확률을 가진 팀 이름 찾기
            if (probability > maxProbability || (probability == maxProbability && teamName.compareTo(bestTeamName) < 0)) {
                bestTeamName = teamName;
                maxProbability = probability;
            }
        }

        System.out.println(bestTeamName); // 결과 출력
        scanner.close();
    }

    // 주어진 문자열에서 특정 문자의 개수를 세는 메소드
    private static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
