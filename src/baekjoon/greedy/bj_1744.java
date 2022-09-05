package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//수 묶기
public class bj_1744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> minus = new ArrayList<Integer>();
        ArrayList<Integer> plus = new ArrayList<Integer>();
        int zero = 0;
        int one = 0;
        for(int i= 0; i<n; i++){
            int temp = sc.nextInt();
            if(temp < 0) {
                minus.add(temp);
            } else if(temp == 0) {
                zero++;
            } else if(temp == 1) {
                one++;
            } else {
                plus.add(temp);
            }
        }

        Collections.sort(minus);
        Collections.sort(plus, Collections.reverseOrder());

        if(minus.size() % 2 != 0) {
            minus.add(zero > 0 ? 0 : 1);
        }
        if(plus.size() % 2 != 0) {
            plus.add(1);
        }

        int ans = one;
        for(int i=0; i<minus.size(); i+=2) {
            ans += minus.get(i) * minus.get(i+1);
        }
        for(int i=0; i<plus.size(); i+=2) {
            ans += plus.get(i) * plus.get(i+1);
        }

        System.out.println(ans);

    }

}
