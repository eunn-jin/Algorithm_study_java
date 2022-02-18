//없는 숫자 더하기
package programmers;

public class pg_6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,8,0};
        int[] a1 = {5,8,4,0,6,7,9};
        System.out.println(solution(a));
        System.out.println(solution(a1));
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        for(int i=0; i<10; i++)
        {
            answer += i;
        }

        for(int i=0; i<numbers.length; i++){
             answer -= numbers[i];
        }

        return answer;
    }
}
