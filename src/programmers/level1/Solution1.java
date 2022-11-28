package programmers.level1;

//문자열 내 p와 y의 개수
public class Solution1 {
    boolean solution(String s) {
        boolean answer = true;

        String containY = s.replaceAll("[^yY]", "");
        String containP = s.replaceAll("[^pP]", "");

        if(containP.length() != containY.length()) {
            answer = false;
        }

        return answer;
    }
}
