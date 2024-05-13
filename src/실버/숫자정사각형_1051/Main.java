package 실버.숫자정사각형_1051;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        int N = Integer.parseInt(sizes[0]);
        int M = Integer.parseInt(sizes[1]);
        
        char[][] grid = new char[N][M];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        
        int maxSize = 1;  // 최소 크기의 정사각형은 1x1

        // 브루트포스로 모든 가능한 정사각형 검사
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int size = 1; i + size < N && j + size < M; size++) {
                    if (grid[i][j] == grid[i + size][j] &&
                        grid[i][j] == grid[i][j + size] &&
                        grid[i][j] == grid[i + size][j + size]) {
                        maxSize = Math.max(maxSize, size + 1);
                    }
                }
            }
        }
        
        System.out.println(maxSize * maxSize);  // 최대 크기의 정사각형의 면적
    }
}
