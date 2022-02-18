//내적
package programmers;

public class pg_5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3, -1, 0, 2};
        int[] a1 = {-1,0,1};
        int[] b1 = {1,0,-1};
        System.out.println(solution(a, b));
        System.out.println(solution(a1, b1));
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }
}
