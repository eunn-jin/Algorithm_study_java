package programmers.level1;

//기사단원의 무기
public class Solution9 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int k = 1;
        while(k <= number) {
            int res = 0;
            int temp = (int)Math.sqrt(k);

            for(int i=1; i<=temp; i++) {
                if(k%i == 0) {
                    res++;
                    if(k/i != i) {
                        res++;
                    }
                }
            }

            if(res > limit) {
                answer += power;
            } else {
                answer += res;
            }

            k++;
        }

        return answer;
    }
}
