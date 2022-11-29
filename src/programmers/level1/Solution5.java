package programmers.level1;

import java.util.*;

//같은 숫자는 싫어
public class Solution5 {
    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(stack.empty() || stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }

        answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
