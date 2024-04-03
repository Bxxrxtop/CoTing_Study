package CountingSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class N10989 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int[] result = new int[n];

        int max = 0;

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
        }

        int[] count = new int[max+1];



        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }

        for(int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }



        for(int i = arr.length-1; i >= 0; i--){
            count[arr[i]]--;
            result[count[arr[i]]] = arr[i];
        }

        for(int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
    }
}
