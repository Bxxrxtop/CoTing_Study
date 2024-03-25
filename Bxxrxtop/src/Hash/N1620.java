package Week1.Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N1620 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String [] arr = new String[N+1];   //  문자열만을 위해

        HashMap<String,Integer> hashMap = new HashMap<>();   // 번호를 위해

        for (int i = 1; i <= N; i++) {
            arr[i] = br.readLine();
            hashMap.put(arr[i],i);
        }


        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if(isNumber(s)){
                int i1 = Integer.parseInt(s);
                System.out.println(arr[i1]);
            }else{
                System.out.println(hashMap.get(s));
            }
        }
    }
    private static boolean isNumber(String s) {
        try {
            int i = Integer.parseInt(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
