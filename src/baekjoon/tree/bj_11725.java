package baekjoon.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//트리의 부모 찾기
public class bj_11725 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            a[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<n-1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v);
            a[v].add(u);
        }

        boolean[] check = new boolean[n+1];
        int[] parent = new int[n+1];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        check[1] = true;
        while(!q.isEmpty()) {
            int x = q.remove();
            for(int y : a[x]){
                if(check[y] == false) {
                    check[y] = true;
                    parent[y] = x;
                    q.add(y);
                }
            }
        }

        for(int i=2; i<=n; i++){
            System.out.println(parent[i]);
        }

    }

}
