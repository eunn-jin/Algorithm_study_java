package programmers.level1;

//평균 구하기
public class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i=0; i < arr.length; i++) {
            answer += arr[i];
        }

        answer = answer / arr.length;

        return answer;
    }
}
