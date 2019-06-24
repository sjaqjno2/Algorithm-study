import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
 
//SWEA :: 1258 [S/W 문제해결 응용] 7일차 - 행렬찾기
//2019-03-07
public class MatrixSearch_1258 {
    static int[][] map;
    static int n;
 
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(bf.readLine());
 
        for (int tc = 1; tc <= T; tc++) {
 
            n = Integer.parseInt(bf.readLine());
            map = new int[n][n];
 
            map = new int[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            } // input
            
            
            ArrayList<pair> list = new ArrayList<>();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] != 0) {
                        //행열 크기 계산을 위한 변수
                        endY = -1;
                        endX = -1;
                        dfs(i, j);
                        list.add(new pair(endY-i+1, endX-j+1));
                        cnt++;
                    }
                }
            }
            System.out.print("#" + tc + " " + cnt);
            
            list.sort(null);
            for(pair p : list) {
                System.out.print(" "+p.y+" "+p.x);
            }
            
            System.out.println();
        } // end of tc
 
    }// end of main
 
    static int endY, endX;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
 
    public static void dfs(int y, int x) {
        map[y][x] = 0; // visit check
        endY = endY < y ? y : endY;
        endX = endX < x ? x : endX;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
 
            if (ny < 0 || ny > n - 1 || nx < 0 || nx > n - 1 || map[ny][nx]==0)
                continue;
 
            dfs(ny, nx);
        }
    }
 
    static class pair implements Comparable<pair> {
        int y;
        int x;
 
        public pair(int y, int x) {
            super();
            this.y = y;
            this.x = x;
        }
 
        @Override
        public int compareTo(pair o) {
            int oMul = o.y * o.x;
            int thisMul = this.y * this.x;
 
            if (oMul == thisMul) {
                return this.y - o.y;
            } else {
                return thisMul - oMul;
            }
        }
 
    }
}