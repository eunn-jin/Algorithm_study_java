package baekjoon.greedy;

import java.util.Scanner;

//NMK
public class bj_1201 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if(m+k-1 > n || m*k < n) {
            System.out.println(-1);
            return;
        }

        int[] end = new int[m+1];
        end[1] = k;
        n = n-k;
        if(m - 1 > 0) {
            int r = n %(m-1);
            int cnt = n / (m-1);
            for(int i=2; i<=m; i++){
                if(r > 0) {
                    end[i] = end[i-1] + cnt + 1;
                    r--;
                } else {
                    end[i] = end[i-1] + cnt;
                }
            }
        }

        for(int i=1; i<=m; i++) {
            for(int j=end[i]; j> end[i-1]; j--) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

    }

}
