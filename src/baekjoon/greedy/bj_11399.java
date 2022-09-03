package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

//ATM
public class bj_11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time[] = new int[n];
        for(int i=0; i<n; i++){
            time[i] = sc.nextInt();
        }

        //시간 정렬
        Arrays.sort(time);

        int sum = 0;
        int ans = 0;
        for(int i=0; i<n; i++) {
            sum += time[i];
            ans += sum;
        }

        System.out.println(ans);

    }

}
