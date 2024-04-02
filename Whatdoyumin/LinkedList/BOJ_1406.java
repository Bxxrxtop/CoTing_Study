package LinkedList;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list = new LinkedList<>();

        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());

        changeInput(input, list);
        editInput(n, br, list);
    }

    public static LinkedList<Character> changeInput(String s, LinkedList<Character> l) {
        l.addFirst(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            l.add(s.charAt(i));
        }

        return l;
    }

    public static void editInput(int n, BufferedReader br, LinkedList<Character> l) throws IOException {
        ListIterator<Character> cursor = l.listIterator();
        while (cursor.hasNext())
            cursor.next();         // 커서를 끝으로 이동

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String command = st.nextToken();
            switch (command.charAt(0)) {
                case 'L':
                    if (cursor.hasPrevious())  // 앞에 문자 있으면 한 칸 앞으로
                        cursor.previous();
                    break;
                case 'D':
                    if (cursor.hasNext())      // 뒤에 문자 있으면 한 칸 뒤로 이동
                        cursor.next();
                    break;
                case 'B':
                    if (cursor.hasPrevious()) {     // 앞에 문자 있으면
                        cursor.previous();          // 커서 한 칸 앞으로 이동
                        cursor.remove();            // 문자 삭제
                    }
                    break;
                case 'P':
                    char p = st.nextToken().charAt(0);
                    cursor.add(p);
                    break;
            }
        }

        for (char c : l) {
            System.out.print(c);
        }
        System.out.println();
    }
}
