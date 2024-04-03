package Tree;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N1967 {
    static class Node{
        int link;
        int value;
        public Node(int link, int value){
            this.link = link;
            this.value = value;
        }
    }

    static int n;
    static List<Node> nodes[];
    static boolean[] visited;
    static int max;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        nodes = new ArrayList[n+1];

        for(int i = 1; i <= n; i++)nodes[i] = new ArrayList<>();

        for(int i = 1; i < n; i++){                                  // leaf는 자식이 없으니까
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            nodes[from].add(new Node(to, value));
            nodes[to].add(new Node(from, value));
        }

        for(int i = 1; i <= n; i++){
            visited = new boolean[n+1];
            visited[i] = true;
            dfs(i, 0);
        }
        System.out.println(max);
    }

    public static void dfs(int index, int value){           // 깊이우선 탐색 함수
        for(Node node : nodes[index]){                      // 모든 노드에 대해
            if(!visited[node.link]){                        // 만약 방문하지 않았으면
                visited[node.link] = true;                  // 방문해주고
                dfs(node.link, node.value+value);     // 계속 깊게 들어가면서 value값 더해줌.
            }                                               // 하지만 내려가지만 않고 올라가기도 한다. 왜냐?
            // link로 다 연결시켜놔서 연결된것들 중에 결국 최대길이를 찾게된다.
        }
        max = Math.max(max, value);                         // max에는 각 leaf들의 value의 최댓값이 들어가면서 결국 최대 길이가 담긴다.
    }

}
