package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2343{
    static int n;
    static int m;
    static int [] arr;
    static int low, high;


    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        int sum = 0;

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            low = Math.max(low, arr[i]);
        }

        high = sum;
        binarySearch();
        System.out.println(low);
    }

    static void binarySearch(){
        int mid, sum, count;

        while(low<=high){
            
        }

    }
}
