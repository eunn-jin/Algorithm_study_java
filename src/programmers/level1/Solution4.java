package programmers.level1;

//문자열 다루기 기본
public class Solution4 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) {
            if(s.replaceAll("[0-9]", "").length() != 0) {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}
