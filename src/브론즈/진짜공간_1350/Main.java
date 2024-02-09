package 브론즈.진짜공간_1350;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 파일의 개수
        long[] sizes = new long[N]; // 파일 크기를 저장할 배열

        for (int i = 0; i < N; i++) {
            sizes[i] = scanner.nextLong(); // 파일 크기 입력
        }

        long clusterSize = scanner.nextLong(); // 클러스터의 크기
        long usedDiskSpace = 0; // 사용한 디스크 공간

        for (long fileSize : sizes) {
            long clustersNeeded = fileSize / clusterSize; // 필요한 클러스터의 개수 계산
            if (fileSize % clusterSize != 0) { // 나머지가 있다면 추가 클러스터 필요
                clustersNeeded++;
            }
            usedDiskSpace += clustersNeeded * clusterSize; // 총 사용 디스크 공간 계산
        }

        System.out.println(usedDiskSpace); // 결과 출력
        scanner.close();
    }
}
