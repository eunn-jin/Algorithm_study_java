package baekjoon.greedy;

import java.util.Scanner;

//잃어버린 괄호
public class bj_1541 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = Integer.MAX_VALUE;
        String[] splitMinus = sc.nextLine().split("-");

        for(int i=0; i< splitMinus.length; i++) {
            int temp = 0;
            String[] splitPlus = splitMinus[i].split("\\+");

            for(int j=0; j< splitPlus.length; j++){
                temp += Integer.parseInt(splitPlus[j]);
            }

            if(sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }

        }

        System.out.println(sum);

    }

}
