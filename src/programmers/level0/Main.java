package programmers.level0;

public class Main {
    public static void main(String[] args) {
        String[] ex1 = {"aya", "yee", "u", "maa"};
        String[] ex2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        int answer = new Solution().solution(ex1);
        int answer2 = new Solution().solution(ex2);

        System.out.println(answer);
        System.out.println(answer2);
    }
}
