package baekjoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//토마토 문제
public class bj_7576 {

    public static final int[] dx = {0, 0, 1, -1};
    public static final int[] dy = {1, -1, 0, 0};

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[n][m];
        int dist[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<Pair>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
                dist[i][j] = -1;
                if(a[i][j] == 1) {
                    q.add(new Pair(i, j));
                    dist[i][j] = 0;
                }
            }
        }

        while(!q.isEmpty()) {
            Pair p = q.remove();
            int x = p.x;
            int y = p.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if(a[nx][ny] == 0 && dist[nx][ny] == -1){
                        q.add(new Pair(nx, ny));
                        dist[nx][ny] = dist[x][y] + 1;
                    }
                }
            }
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(ans < dist[i][j]) {
                    ans = dist[i][j];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j] == 0 && dist[i][j] == -1) {
                    ans = -1;
                }
            }
        }

        System.out.println(ans);

    }
}

//class Pair {
//    int x;
//    int y;
//
//    Pair(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}