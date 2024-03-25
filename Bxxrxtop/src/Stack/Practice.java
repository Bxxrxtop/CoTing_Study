package Week1.Stack;

public class Practice {

    boolean solution(String s) {
        boolean answer = false;
        boolean leftFirst = true;
        char[] stack = new char[s.length()];
        int leftCount = 0;
        int rightCount = 0;

        for(int i = 0; i < s.length(); i++){
            stack[i] = s.charAt(i);
            if(stack[i] == '('){
                leftCount++;
            }
            if(stack[i] == ')'){
                rightCount++;
            }
            if(leftCount < rightCount){          // 만약 처음에 ')' 이 조건을 성립함. -> 아웃~
                leftFirst = false;
            }
        }

        if(stack[0] == '(' && stack[s.length()-1] == ')'){
            if(leftCount == rightCount && leftFirst){
                answer = true;
            }
        }

        return answer;
    }
}
