package InsertionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N24051 {          
    public static int insertionSort(int [] arr, int k){
        int loc;
        int newItem;
        int count = 0;
        for(int i = 2; i <= arr.length; i++){
            loc = i-1;
            newItem = arr[i];

            while (loc>=1 && newItem < arr[loc]){
                arr[loc+1] = arr[loc];
                loc--;
                count++;
                if(count == k){
                    return arr[loc+1];
                }
            }
            if(loc + 1 != i){
                arr[loc+1]= newItem;
                count++;
                if(count == k){
                    return arr[newItem];
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        String array = br.readLine();
        st = new StringTokenizer(array);

        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(insertionSort(arr, k));
    }


}
