package programmers.level1;

//3진법 뒤집기
public class Solution13 {
    public int solution(int n) {
        int answer = 0;

        String temp = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(temp);
        String reverse = sb.reverse().toString();

        answer = Integer.parseInt(reverse, 3);

        return answer;
    }
}
