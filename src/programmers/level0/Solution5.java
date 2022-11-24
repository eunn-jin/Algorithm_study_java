package programmers.level0;

//연속된 수의 합
public class Solution5 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int i= 0;
        int sum = 0;

        if(total == 0) {
            int temp = num/2;
            for(int j = num-1; j >= 0; j--) {
                answer[j] = temp;
                temp--;
            }
        }

        while(total != 0 && total != sum) {
            sum = 0;
            int temp = i;

            for(int j=0; j<num; j++) {
                sum += temp;
                answer[j] = temp;
                temp++;
            }

            if(total < sum) {
                i--;
            } else if(total > sum) {
                i++;
            } else {
                break;
            }
        }

        return answer;
    }
}
