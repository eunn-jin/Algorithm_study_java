package baekjoon.graph;

import java.util.Scanner;

//섬의 개수
public class bj_4963 {

    public static final int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static final int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w == 0 && h == 0) {
                break;
            }

            int a[][] = new int[h][w];
            for(int i = 0; i<h; i++) {
                for(int j = 0; j<w; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            int group[][] = new int[h][w];
            int cnt = 0;
            for(int i = 0; i<h; i++) {
                for(int j = 0; j<w; j++) {
                    if(a[i][j] == 1 && group[i][j] == 0) {
                        dfs(a, group, i, j, ++cnt, w, h);
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    public static void dfs(int a[][], int group[][], int x, int y, int cnt, int w, int h) {
        group[x][y] = cnt;

        for(int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < h && ny >= 0 && ny < w) {
                if(a[nx][ny] == 1 && group[nx][ny] == 0) {
                    dfs(a, group, nx, ny, cnt, w, h);
                }
            }
        }
    }
}
