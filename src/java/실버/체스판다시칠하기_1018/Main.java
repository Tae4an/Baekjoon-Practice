package 실버.체스판다시칠하기_1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 정수 입력 후 다음 줄로 넘어감

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;

        // 모든 8x8 부분 보드에 대해 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minChanges = Math.min(minChanges, findMinChanges(board, i, j));
            }
        }

        System.out.println(minChanges);

    }

    // 주어진 시작점에서 8x8 체스판을 만들기 위해 필요한 최소 변경 횟수를 계산하는 함수
    private static int findMinChanges(char[][] board, int startRow, int startCol) {
        int changes1 = 0; // 맨 왼쪽 위가 흰색인 경우
        int changes2 = 0; // 맨 왼쪽 위가 검은색인 경우

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) { // 흰색이어야 하는 칸
                    if (board[startRow + i][startCol + j] != 'W') changes1++;
                    if (board[startRow + i][startCol + j] != 'B') changes2++;
                } else { // 검은색이어야 하는 칸
                    if (board[startRow + i][startCol + j] != 'B') changes1++;
                    if (board[startRow + i][startCol + j] != 'W') changes2++;
                }
            }
        }

        return Math.min(changes1, changes2);
    }
}
