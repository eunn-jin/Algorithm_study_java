package baekjoon.graph;

import java.util.Arrays;
import java.util.Scanner;

//단지번호붙이기
public class bj_2667 {

    public static final int[] dx = {0, 0, 1, -1};
    public static final int[] dy = {1, -1, 0, 0};

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a[][] = new int[n][n];

        for(int i = 0; i<n; i++) {
            String s = sc.nextLine();
            for(int j=0; j<n; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }

        int group[][] = new int[n][n];
        int cnt = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if(a[i][j] == 1 && group[i][j] == 0) {
                    dfs(a, group, i, j, ++cnt, n);
                }
            }
        }

        int ans[] = new int[cnt];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(group[i][j] != 0) {
                    ans[group[i][j]-1] += 1;
                }
            }
        }

        Arrays.sort(ans);
        System.out.println(cnt);
        for(int i=0; i<cnt; i++){
            System.out.println(ans[i]);
        }

    }

    public static void dfs(int a[][], int group[][], int x, int y, int cnt, int n) {
        group[x][y] = cnt;
        for(int k=0; k<4; k++){
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(nx >= 0 && nx < n && ny >= 0 && ny <n) {
                if(a[nx][ny] == 1 && group[nx][ny] == 0) {
                    dfs(a, group, nx, ny, cnt, n);
                }
            }
        }
    }
}
