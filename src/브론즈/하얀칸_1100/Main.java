package 브론즈.하얀칸_1100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 8; i++) {
            String row = scanner.nextLine();

            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && row.charAt(j) == 'F') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
