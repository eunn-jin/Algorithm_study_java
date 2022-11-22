package programmers.level0;

//k의 개수
public class Solution6 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        String strK = Integer.toString(k);
        char chK = strK.charAt(0);

        for(int p=i; p<=j; p++){
            String temp = Integer.toString(p);
            if(temp.contains(strK)) {
                for(int l=0; l<temp.length(); l++) {
                    char chTemp = temp.charAt(l);
                    if(chTemp == chK) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    //숫자로
    public int solution2(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }

    //replace 이용
    public int solution3(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }

}
