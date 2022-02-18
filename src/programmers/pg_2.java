//크레인 인형 뽑기
package programmers;
import java.util.Stack;

public class pg_2 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution( board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int temp;
        int rows = board.length;
        int num=0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<moves.length; i++){
            temp = moves[i]-1;
            for(int j=0; j<rows; j++){
                if(board[j][temp] != 0){
                    if(!stack.empty() && stack.peek() == board[j][temp]){
                        answer = answer+2;
                        stack.pop();
                    }
                    else {
                        stack.push(board[j][temp]);
                    }
                    board[j][temp] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
