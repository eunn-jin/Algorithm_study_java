package baekjoon.greedy;

import java.util.Scanner;

//동전 0
public class bj_11047 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int money[] = new int[n];
        for(int i=0; i<n; i++){
            money[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i=n-1; i>=0; i--){
            ans += k/money[i];
            k %= money[i];
        }

        System.out.println(ans);

    }
}
