//이분 그래프
package baekjoon.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class bj_1707 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for(int i=0; i<k; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];

            for(int j=1; j<=n; j++){
                a[j] = new ArrayList<Integer>();
            }
            for(int j=0; j<m; j++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                a[u].add(v);
                a[v].add(u);
            }

            int[] color = new int[n+1];
            boolean ok = true;
            for(int j=1; j<=n; j++){
                if(color[j] == 0){
                    dfs(a, color, j, 1);
                }
            }
            for(int j=1; j<=n; j++){
                for(int l : a[j]){
                    if(color[j] == color[l]) {
                        ok = false;
                    }
                }
            }

            if(ok){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }
    }

    public static void dfs(ArrayList<Integer>[] a, int[] color, int x, int c){
        color[x] = c;
        for(int y : a[x]){
            if(color[y] == 0){
                dfs(a, color, y, 3-c);
            }
        }
    }
}
