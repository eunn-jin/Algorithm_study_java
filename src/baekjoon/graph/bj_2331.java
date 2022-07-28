package baekjoon.graph;

import java.util.Scanner;

//반복수열
public class bj_2331 {
    public static int[] check = new int[1000000000];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(length(n, x, 1));
    }

    public static int pow(int n, int x) {
        int ans = 1;
        for(int i=0; i<x; i++) {
            ans = ans * n;
        }
        return ans;
    }

    public static int next(int n, int x) {
        int ans = 0;
        while(n > 0) {
            ans += pow(n%10, x);
            n/=10;
        }
        return ans;
    }

    public static int length(int n, int x, int cnt) {
        if(check[n] != 0) {
            return check[n]-1;
        }
        check[n] = cnt;
        n = next(n, x);
        return length(n, x, cnt+1);
    }
}
