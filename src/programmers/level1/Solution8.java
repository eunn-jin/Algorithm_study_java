package programmers.level1;

//약수의 개수와 덧셈
public class Solution8 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {
            if(evencheck(i)){
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public boolean evencheck(int n){
        int temp = (int)Math.sqrt(n);
        int cnt = 0;
        for(int i=1; i<=temp; i++) {
            if(n%i == 0) {
                cnt++;
                if(n/i != i) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        if(cnt%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
