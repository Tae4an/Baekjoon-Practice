package 실버.보물_1026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Pair implements Comparable<Pair> {
        int value, index;
        
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
        
        @Override
        public int compareTo(Pair other) {
            return other.value - this.value; // B에 대해서 내림차순 정렬
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        Pair[] B = new Pair[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            B[i] = new Pair(value, i);
        }
        
        Arrays.sort(A); // A 오름차순 정렬
        Arrays.sort(B); // B 내림차순 정렬
        
        long S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i] * B[i].value; // 최소값 계산
        }
        
        System.out.println(S);
    }
}
