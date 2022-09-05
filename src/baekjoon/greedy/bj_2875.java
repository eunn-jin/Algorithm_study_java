package baekjoon.greedy;

import java.util.Scanner;

//대회 or 인턴
public class bj_2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;

        while(n >= 2 && m >= 1 && n+m >= k+3) {
            ans += 1;
            n -= 2;
            m -= 1;
        }

        System.out.println(ans);

    }
}
