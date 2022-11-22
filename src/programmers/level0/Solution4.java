package programmers.level0;

//안전지대
public class Solution4 {
    public int solution(int[][] board) {
        int answer = 0;

        int[] mx = { -1, 0, 1, -1, 1, -1, 0, 1};
        int[] my = {-1, -1, -1, 0, 0, 1, 1, 1};
        int n = board.length;

        for(int i = 0; i < n; i++) {
            for(int j=0; j < n; j++) {
                if(board[i][j] == 1) {
                    for(int k=0; k< 8; k++){
                        int x = i + mx[k];
                        int y = j + my[k];
                        if(x >= 0 && x < n && y >= 0 && y < n && board[x][y] != 1) {
                            board[x][y] = 2;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j=0; j < n; j++) {
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
