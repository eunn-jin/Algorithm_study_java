package programmers.level0;

public class Main {
    public static void main(String[] args) {
        String[] s1_1 = {"aya", "yee", "u", "maa"};
        String[] s1_2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        int[][] s2_1 = {{1, 4}, {9, 2}, {3, 8}, {10, 4}};
        int[][] s2_2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

//        int answer = new Solution2().solution(s2_1);
//        int answer2 = new Solution2().solution(s2_2);

        int answer = new Solution6().solution(1, 13, 1);

        System.out.println("1: "+answer);

    }
}
