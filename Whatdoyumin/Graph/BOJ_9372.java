package Graph;

import java.util.Scanner;
public class BOJ_9372 {
    // 그래프로 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스의 수 T
        int T = sc.nextInt();

        for(int  i = 0; i < T; i++){
            // 국가의 수 N
            int N = sc.nextInt();
            // 비행기의 종류 M
            int M = sc.nextInt();

            for(int  j = 0; j < M; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
            }

            System.out.println(N - 1);
        }
    }
}
