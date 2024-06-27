package 브론즈.성지키기_1236;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        boolean[] rowGuarded = new boolean[N];
        boolean[] colGuarded = new boolean[M];

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowGuarded[i] = true;
                    colGuarded[j] = true;
                }
            }
        }

        int rowCount = 0;
        int colCount = 0;
        for (int i = 0; i < N; i++) {
            if (!rowGuarded[i]) rowCount++;
        }
        for (int j = 0; j < M; j++) {
            if (!colGuarded[j]) colCount++;
        }

        System.out.println(Math.max(rowCount, colCount));

        scanner.close();
    }
}
