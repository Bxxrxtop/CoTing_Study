package PriorityQueue;

import java.util.Scanner;
import java.util.PriorityQueue;

public class BOJ_15903 {
    public static void main(String[] args) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int numOfCard = sc.nextInt();
        int numOfSum = sc.nextInt();
        long sum = 0;

        for(int i = 0; i < numOfCard; i++){
            long input = sc.nextInt();
            minHeap.add(input);
        }

        for(int i = 0; i < numOfSum; i++){
            long x = minHeap.poll();
            long y = minHeap.poll();

            minHeap.add(x + y);
            minHeap.add(x + y);
        }

        while(!minHeap.isEmpty()){
            sum += minHeap.poll();
        }
        System.out.println(sum);

    }
}
