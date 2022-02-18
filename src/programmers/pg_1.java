//숫자 문자열과 영단어
package programmers;
public class pg_1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("one4seveneight"));
        System.out.println(s.solution("23four5six7"));
        System.out.println(s.solution("2three45sixseven"));
        System.out.println(s.solution("123"));
    }

}

class Solution{
    public int solution(String s) {
        String answer = "";
        int i=0;

        while(i < s.length()){
            char temp = s.charAt(i);
            if(temp >= '0' && temp <= '9') {
                answer = answer + temp;
                i++;
            }
            else if(temp == 't'){
                if(s.charAt(i+1) == 'w'){
                    answer = answer + '2';
                    i = i+3;
                }
                else{
                    answer = answer + '3';
                    i = i+5;
                }
            }
            else if(temp == 'f'){
                if(s.charAt(i+1) == 'o'){
                    answer = answer + '4';
                    i = i+4;
                }
                else{
                    answer = answer + '5';
                    i = i+4;
                }
            }
            else if(temp == 's'){
                if(s.charAt(i+1) == 'i'){
                    answer = answer + '6';
                    i = i+3;
                }
                else{
                    answer = answer + '7';
                    i = i+5;
                }
            }
            else {
                switch (temp){
                    case 'z': answer = answer + '0';
                        i = i+4;
                        break;
                    case 'o': answer = answer + '1';
                        i = i+3;
                        break;
                    case 'e': answer = answer + '8';
                        i = i+5;
                        break;
                    case 'n': answer = answer + '9';
                        i = i+4;
                        break;
                }
            }
        }

        return  Integer.parseInt(answer);
    }
}
