package CountinSort;

import java.io.*;

public class BOJ_10989 {
    // 시간 제한 5초, 메모리 제한 8MB
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];           // 숫자 카운트 수 저장 배열

        // 입력받은 수 카운트
        for(int i = 0; i < N; i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        // 정렬 결과
        for(int i = 1; i < 10001; i++){
            while (count[i] > 0){   // 해당 숫자 등장 수 만큼
                bw.write(i + "\n");
                count[i]--;         // 등장 횟수 감소
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
