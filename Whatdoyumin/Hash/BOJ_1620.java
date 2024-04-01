package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class BOJ_1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        HashMap<Integer, String> numMap = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            numMap.put(i + 1, name);
            nameMap.put(name, i + 1);
        }

        for(int i = 0; i < m; i++){
            String input = sc.nextLine();
            if (input.matches("\\d+")){
                int numInput = Integer.parseInt(input);
                System.out.println(numMap.get(numInput));
            } else
                System.out.println(nameMap.get(input));
        }
    }
}
