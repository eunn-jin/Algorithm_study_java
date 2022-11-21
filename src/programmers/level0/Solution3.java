package programmers.level0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//겹치는 선분의 길이
public class Solution3 {
    public int solution(int[][] lines) {
        int answer = 0;

        ArrayList<Pair> arr = new ArrayList<>();
        Set<Pair> set = new HashSet<>();

        for(int i=0; i<lines.length; i++) {
            for(int j= lines[i][0]; j<lines[i][1]; j++) {
                Pair p = new Pair(j, j+1);
                if(arr.contains(p)) {
                    set.add(p);
                } else {
                    arr.add(p);
                }
            }
        }
        answer = set.size();
        return answer;
    }

    class Pair {
        int start;
        int end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public boolean equals(Object object) {
            Pair pair = (Pair)object;
            return (pair.start == this.start && pair.end == this.end);
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }
}
