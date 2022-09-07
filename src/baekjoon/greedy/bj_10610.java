package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

//30
public class bj_10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        Arrays.sort(s);

        int sum = 0;
        for(int i=0; i<s.length; i++){
            sum += s[i] - '0';
        }

        if((s[0] == '0') && (sum % 3 == 0)) {
            for(int i=s.length-1; i>=0; i--) {
                System.out.print(s[i]);
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }

    }
}
