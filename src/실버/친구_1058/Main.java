package 실버.친구_1058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] friends = new boolean[N][N];

        // 친구 관계 입력받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                if (line.charAt(j) == 'Y') {
                    friends[i][j] = true;
                }
            }
        }

        // 2-친구 관계 계산
        boolean[][] twoFriends = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (friends[i][j]) {
                    twoFriends[i][j] = true; // 직접 친구인 경우
                    // 친구의 친구 찾기
                    for (int k = 0; k < N; k++) {
                        if (friends[j][k] && i != k) {
                            twoFriends[i][k] = true;
                        }
                    }
                }
            }
        }

        // 가장 유명한 사람의 2-친구 수 찾기
        int maxTwoFriends = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (twoFriends[i][j]) count++;
            }
            if (count > maxTwoFriends) {
                maxTwoFriends = count;
            }
        }

        System.out.println(maxTwoFriends);
    }
}
