package programmers.level0;

import java.util.ArrayList;
//평행
public class Solution2 {
    public int solution(int[][] dots) {
        ArrayList<Double> arr = new ArrayList<>();

        for(int i=0; i<dots.length; i++) {
            for(int j=i+1; j<dots.length; j++) {
                double w1 = (double)(dots[i][1]-dots[j][1])/(dots[i][0]-dots[j][0]);
                if(arr.contains(w1)) {
                    return 1;
                } else {
                    arr.add(w1);
                }
            }
        }

        return 0;
    }
}
