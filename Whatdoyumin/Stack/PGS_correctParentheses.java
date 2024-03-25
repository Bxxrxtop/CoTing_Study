package Stack;

import java.util.Scanner;
import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char charInput = s.charAt(i);
            if(charInput == '(') {
                stack.push(charInput);
            } else if(charInput == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}


public class PGS_correctParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.solution(input));
    }
}
