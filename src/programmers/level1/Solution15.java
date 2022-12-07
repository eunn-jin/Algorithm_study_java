package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

//k번째수
public class Solution15 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int n=0;
        while(n < commands.length) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            ArrayList<Integer> arr = new ArrayList<>();
            for(int p=i-1; p<j; p++) {
                arr.add(array[p]);
            }
            Collections.sort(arr);
            answer[n] = arr.get(k-1);
            n++;
        }

        return answer;
    }
}
