package programmers.level0;
//옹알이 문제
public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] noList = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] speakList = {"aya", "ye", "woo", "ma"};

        for (String str : babbling) {
            for(String no : noList) {
                str = str.replace(no, "x");
            }
            for(String speak : speakList) {
                str = str.replace(speak, "");
            }

            if(str.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}
