package programmers.level1;

//부족한 금액 계산하기
public class Solution12 {
    public long solution(int price, int money, int count) {
        long answer = money;

        for(int i=1; i<=count; i++) {
            answer -= price*i;
        }

        if(answer >= 0) {
            answer = 0;
        } else {
            answer = answer * (-1);
        }

        return answer;
    }

}
