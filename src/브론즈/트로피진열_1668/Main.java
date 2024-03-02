package 브론즈.트로피진열_1668;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] trophies = new int[N];

        for (int i = 0; i < N; i++) {
            trophies[i] = sc.nextInt();
        }

        System.out.println(visibleTrophies(trophies, true));  // 왼쪽에서 보는 경우
        System.out.println(visibleTrophies(trophies, false)); // 오른쪽에서 보는 경우
    }

    public static int visibleTrophies(int[] trophies, boolean fromLeft) {
        int visibleCount = 0;
        int maxHeight = 0;

        if (fromLeft) {
            for (int i = 0; i < trophies.length; i++) {
                if (trophies[i] > maxHeight) {
                    visibleCount++;
                    maxHeight = trophies[i];
                }
            }
        } else {
            for (int i = trophies.length - 1; i >= 0; i--) {
                if (trophies[i] > maxHeight) {
                    visibleCount++;
                    maxHeight = trophies[i];
                }
            }
        }

        return visibleCount;
    }
}
