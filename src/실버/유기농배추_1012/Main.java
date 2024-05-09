package 실버.유기농배추_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] farm;
    private static boolean[][] visited;
    private static int M, N, K;
    private static int[] dx = {0, 0, 1, -1}; // 상하좌우 이동을 위한 x, y 방향 값
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 배추밭의 가로 길이
            N = Integer.parseInt(st.nextToken()); // 배추밭의 세로 길이
            K = Integer.parseInt(st.nextToken()); // 배추 위치의 수

            farm = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[y][x] = 1; // 배추 심기 (1은 배추가 있는 위치)
            }

            int wormCount = 0; // 필요한 지렁이 수
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (farm[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j); // DFS로 배추 그룹 탐색
                        wormCount++; // 연결된 배추 그룹마다 지렁이 1마리 필요
                    }
                }
            }
            sb.append(wormCount).append("\n");
        }
        System.out.println(sb.toString()); // 모든 테스트 케이스에 대한 결과 출력
    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) { // 상하좌우 탐색
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (farm[ny][nx] == 1 && !visited[ny][nx]) {
                    dfs(ny, nx); // 연결된 배추가 있으면 계속 탐색
                }
            }
        }
    }
}
