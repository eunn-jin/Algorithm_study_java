package programmers.level0;

//분수의 덧셈
public class Solution7 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int num3 = num1*num2;
        int denum3 = (denum1 * num2) + (denum2 * num1);
        int temp = num3<denum3? num3: denum3;
        temp = temp /2;

        while(temp > 0) {
            if(num3%temp == 0 && denum3%temp ==0) {
                num3 = num3 / temp;
                denum3 = denum3 / temp;
            }
            temp--;
        }

        answer[0] = denum3;
        answer[1] = num3;

        return answer;
    }
}
