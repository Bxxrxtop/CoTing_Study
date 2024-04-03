package PriorityQueue;


import java.util.PriorityQueue;
import java.util.Scanner;

public class N15903 {
    // 최소힙 문제!
    static PriorityQueue<Long> pq = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++){
            Long value = sc.nextLong();
            pq.add(value);
        }

        for(int i = 0; i<m; i++){
            Long a =pq.poll();
            Long b = pq.poll();
            pq.add(a+b);
            pq.add(a+b);
        }

        long result = 0;

        while(!pq.isEmpty()){
            result += pq.poll();
        }


        System.out.println(result);

    }


}
