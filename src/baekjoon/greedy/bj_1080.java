package baekjoon.greedy;

import java.io.*;

//행렬
public class bj_1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                A[i][j] = str.charAt(j) - '0';
            }
        }
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                B[i][j] = str.charAt(j) - '0';
            }
        }

        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(A[i][j] != B[i][j]  && i+2<n && j+2<m) {
                    for(int k=0; k<3; k++) {
                        for(int l=0; l<3; l++){
                            A[i+k][j+l] = A[i+k][j+l] == 0? 1 : 0;
                        }
                    }
                    cnt++;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(A[i][j] != B[i][j]) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                    bw.flush();
                    return;
                }
            }
        }
        bw.write(Integer.toString(cnt));
        bw.newLine();
        bw.flush();
        return;
    }
}
