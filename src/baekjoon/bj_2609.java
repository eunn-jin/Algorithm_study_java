package baekjoon;

import java.util.Scanner;

public class bj_2609 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int g, l;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        g = gcd(n1, n2);
        l = n1*n2/g;

        System.out.println(g);
        System.out.println(l);
    }
    public static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        else {
            return gcd(y, x%y);
        }
    }
}
