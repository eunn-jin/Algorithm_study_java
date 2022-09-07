package baekjoon.greedy;

import java.util.Scanner;

//병든 나이트
public class bj_1783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(Math.min(4, (m+1)/2));
        } else {
            if(m < 7) {
                System.out.println(Math.min(4, m));
            } else {
                System.out.println(m-2);
            }
        }

    }
}
