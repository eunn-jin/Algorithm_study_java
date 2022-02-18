import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int lower = 0;
            int upper = 0;
            int digit = 0;
            int space = 0;

            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if ('A' <= c && c <= 'Z') {
                    upper += 1;
                } else if ('a' <= c && c <= 'z') {
                    lower += 1;
                } else if ('0' <= c && c <= '9') {
                    digit += 1;
                } else if (c == ' ') {
                    space += 1;
                }
            }
            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }



//        Solution s = new Solution();
//        int[] a = {1,2,3,4,6,7,8,0};
//        int[] a1 = {5,8,4,0,6,7,9};
//        System.out.println(s.solution(a));
//        System.out.println(s.solution(a1));

        //        Solution1 s1 = new Solution1();
//        int[] a = {1,2,3,4};
//        int[] b = {-3, -1, 0, 2};
//        int[] a1 = {-1,0,1};
//        int[] b1 = {1,0,-1};
//        System.out.println(s1.solution(a, b));
//        System.out.println(s1.solution(a1, b1));
    }
}


class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i=0; i<10; i++)
        {
            answer += i;
        }

        for(int i=0; i<numbers.length; i++){
             answer -= numbers[i];
        }

        return answer;
    }
}

class Solution1 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }
}