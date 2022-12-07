package programmers.level1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//두 개 뽑아서 더하기
public class Solution14 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set  = new TreeSet<Integer>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                set.add(num);
            }
        }

        Iterator<Integer> iterator = set.iterator();
        answer = new int[set.size()];
        int i=0;
        while(iterator.hasNext()) {
            answer[i] = iterator.next();
            i++;
        }

        return answer;
    }
}

