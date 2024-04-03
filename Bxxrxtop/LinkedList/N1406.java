package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> list = new LinkedList<>();

        int courser = 0;

        // 첫 문자열 받기
        String input = br.readLine();

        // 문자열 char로 list에 추가
        for(int i = 0; i < input.length(); i++){
            list.add(String.valueOf(input.charAt(i)));
        }


        int n = Integer.parseInt(br.readLine());
        courser = input.length();


        for(int i = 0; i < n; i++){
            String order = br.readLine();

            if(order.charAt(0) == 'L'){
                if(courser != 0){
                    courser--;
                }

            } else if (order.charAt(0) == 'D') {
                if(courser != list.size()) {
                    courser++;
                }
            }
            else if(order.charAt(0) == 'B'){
                if(courser != 0){
                    list.remove(--courser);
                }
            }
            else{
                StringTokenizer st = new StringTokenizer(order);
                st.nextToken();
                String append = st.nextToken();
                if(courser == list.size()){
                    list.add(append);
                    courser++;
                }
                else {
                    list.add(courser, append);
                    courser++;
                }
            }
        }
        String answer;
        for(String s : list){
            System.out.print(s);
        }

    }
}
