package programmers.level1;

//[1차]비밀지도
public class Solution11 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] map = new int[n][n];
        for(int i=0; i<n; i++) {
            String line1 = Integer.toBinaryString(arr1[i]);
            int len = line1.length();
            int temp = n-1;
            for(int j=len-1; j>=0; j--) {
                if(line1.charAt(j) == '1') {
                    map[i][temp] = 1;
                }
                temp--;
            }

            String line2 = Integer.toBinaryString(arr2[i]);
            len = line2.length();
            temp = n-1;
            for(int j=len-1; j>=0; j--) {
                if(line2.charAt(j) == '1') {
                    map[i][temp] = 1;
                }
                temp--;
            }
        }

        for(int i=0; i<n; i++) {
            String res = "";
            for(int j=0; j<n; j++) {
                if(map[i][j] == 1) {
                    res = res + "#";
                } else {
                    res = res + " ";
                }
            }
            answer[i] = res;
        }

        return answer;
    }
}
