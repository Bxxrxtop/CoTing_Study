package InsertionSort;

import java.util.Scanner;

public class BOJ_24051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N + 1];
        int count = 0;     // 저장 횟수

        // 배열 원소 입력 (문제 의사코드대로 인덱스 1부터)
        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 2; i <= N; i++){
            int su = arr[i];                // 현재 요소
            int j = i - 1;                  // 현재 바로 전 요소 인덱스

            while(j >= 1 && su < arr[j]){   // 현재 요소가 바로 전 요소보다 작을 동안
                arr[j + 1] = arr[j];        // 오른쪽으로 요소들 이동
                j--;
                count++;
                if (count == K){            // 저장 카운트값이 K와 같으면 해당 요소 출력
                    System.out.println(arr[j + 1]);
                    return;
                }
            }
            if (j + 1 != i) {
                arr[j + 1] = su;            // su를 해당 위치에 넣음
                count++;
                if (count == K){
                    System.out.println(su); // 저장 카운트값이 K와 같으면 해당 요소 출력
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
