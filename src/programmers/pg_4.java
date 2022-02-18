//콜라츠 추측
package programmers;

public class pg_4 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    public static int solution(long num) {
        int answer = 0;

        while(answer <= 500){
            if(num == 1) {
                break;
            }
            else if(num % 2 == 0){
                num = num/2;
                answer++;
            }
            else {
                num = num*3 +1;
                answer++;
            }
        }

        if(answer > 500) {
            answer = -1;
        }

        return answer;
    }
}
