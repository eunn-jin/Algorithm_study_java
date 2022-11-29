package programmers.level1;

//서울에서 김서방 찾기
public class Solution3 {
    public String solution(String[] seoul) {
        String answer = "";

        int i = 0;
        for (String s : seoul) {
            if(s.contains("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
            i++;
        }

        return answer;
    }
}
