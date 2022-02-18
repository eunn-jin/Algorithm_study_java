//핸드폰 번호 가리기
package programmers;

public class pg_3 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = phone_number.length();

        for(int i=0; i<len; i++){
            if(i<(len-4)){
                sb.append("*");
            }
            else {
                sb.append(phone_number.charAt(i));
            }
        }

        answer = sb.toString();
        return answer;
    }
}