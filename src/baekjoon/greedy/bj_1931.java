package baekjoon.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//회의실 배정
public class bj_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m[][] = new int[n][2];
        for(int i=0; i<n; i++){
            m[i][0] = sc.nextInt();
            m[i][1] = sc.nextInt();
        }

        Arrays.sort(m, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });

        int ans = 0;
        int endTime = 0;
        for(int i=0; i<n; i++) {
            if(endTime <= m[i][0]) {
                endTime = m[i][1];
                ans++;
            }
        }

        System.out.println(ans);

    }
}
