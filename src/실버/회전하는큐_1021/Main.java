package 실버.회전하는큐_1021;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());  // 큐의 크기
        int M = Integer.parseInt(st.nextToken());  // 뽑아내려고 하는 원소의 수
        int[] positions = new int[M];  // 뽑아내려고 하는 원소의 위치

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            positions[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int totalMoves = 0;

        for (int i = 0; i < M; i++) {
            int targetPos = positions[i];
            int index = queue.indexOf(targetPos);

            int leftMoves = index;  // 왼쪽으로 이동 횟수
            int rightMoves = queue.size() - index;  // 오른쪽으로 이동 횟수

            // 최소 이동을 계산하고 그 방향으로 큐를 조정
            if (leftMoves <= rightMoves) {
                while (leftMoves-- > 0) {
                    queue.addLast(queue.removeFirst());
                    totalMoves++;
                }
            } else {
                while (rightMoves-- > 0) {
                    queue.addFirst(queue.removeLast());
                    totalMoves++;
                }
            }

            // 첫 번째 원소 추출
            queue.removeFirst();
        }

        System.out.println(totalMoves);
    }
}
