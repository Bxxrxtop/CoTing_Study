package QuickSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N24091 {
    static int k;
    static int count;

    public static void quickSort(int[] arr, int p, int r){
        int q;
        if(p < r){
            q = partition(arr, p, r);
            if (count == k) return; // 만약 k번의 교환을 마쳤으면 더 이상 정렬하지 않음
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }

    public static int partition(int[] arr, int p, int r){
        int x = arr[r];
        int i = p-1;
        for(int j = p; j < r; j++){
            if(arr[j] <= x){
                int temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
                count++;
                if (count == k) return i; // 만약 k번의 교환을 마쳤으면 현재의 i를 반환하여 quickSort 중단
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        count++;
        if (count == k) return i + 1; // 만약 k번의 교환을 마쳤으면 현재의 i + 1을 반환하여 quickSort 중단
        return i+1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        count = 0; // 교환 횟수 초기화
        quickSort(arr, 0, n - 1);

        if (count < k) {
            System.out.println("-1");
        } else {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}

