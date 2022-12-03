package programmers.level1;

import java.util.Arrays;

//예산
public class Solution10 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
            budget -= d[i];
            if(budget < 0) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
