package baekjoon.graph;

import java.util.Scanner;

//순열 사이클
public class bj_10451 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            boolean[] c = new boolean[n+1];
            for(int j=1; j<=n; j++){
                a[j] = sc.nextInt();
                c[j] = false;
            }

            int ans = 0;
            for(int k=1; k<=n; k++) {
                if(c[k] == false) {
                    dfs(a, c, k);
                    ans += 1;
                }
            }

            System.out.println(ans);

        }
    }

    public static void dfs(int[] a, boolean[] c, int i){
        if(c[i]) {
            return;
        } else {
            c[i] = true;
            dfs(a, c, a[i]);
        }
    }
}
