import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Tomato_7569 {
 
    private int ripenTomatoCnt = 0;
    private int emptyBoxCnt = 0;
    private int[][][] checked;
    private int[][][] boxInfo;
    private int m = 0, n = 0, h = 0;
    private Queue<Box> queue;
 
    private static final int[] DM = { -1, 1, 0, 0, 0, 0 };
    private static final int[] DN = { 0, 0, -1, 1, 0, 0 };
    private static final int[] DH = { 0, 0, 0, 0, -1, 1 };
 
    class Box {
        int m;
        int n;
        int h;
 
        public Box(int m, int n, int h) {
            this.m = m;
            this.n = n;
            this.h = h;
        }
 
        public int getM() {
            return m;
        }
 
        public void setM(int m) {
            this.m = m;
        }
 
        public int getN() {
            return n;
        }
 
        public void setN(int n) {
            this.n = n;
        }
 
        public int getH() {
            return h;
        }
 
        public void setH(int h) {
            this.h = h;
        }
 
    }
 
    public boolean isAccessible(int i, int j, int k) {
        if (i < 0 || j < 0 || k < 0 || i > m - 1 || j > n - 1 || k > h - 1) {
            return false;
        }
        if (checked[i][j][k] != -1) {
            return false;
        }
        return true;
    }
 
    public int getMinDay() {
        int day = 0;
 
        while (!queue.isEmpty()) {
            Box cur = queue.poll();
            int curM = cur.getM();
            int curN = cur.getN();
            int curH = cur.getH();
            for (int i = 0; i < 6; i++) {
                int nextM = curM + DM[i];
                int nextN = curN + DN[i];
                int nextH = curH + DH[i];
                if (isAccessible(nextM, nextN, nextH)) {
                    if (boxInfo[nextM][nextN][nextH] == 0) {
                        checked[nextM][nextN][nextH] = checked[curM][curN][curH] + 1;
                        day = Math.max(day, checked[nextM][nextN][nextH]);
                        ripenTomatoCnt++;
                        queue.add(new Box(nextM, nextN, nextH));
                    }
                }
            }
 
        }
 
        return day;
    }
 
    public void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        this.m = Integer.parseInt(inputs[0]);
        this.n = Integer.parseInt(inputs[1]);
        this.h = Integer.parseInt(inputs[2]);
 
        checked = new int[m][n][h];
        boxInfo = new int[m][n][h];
        queue = new LinkedList<Box>();
 
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                inputs = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    checked[k][j][i] = -1; // 확인안된 토마토
                    boxInfo[k][j][i] = Integer.parseInt(inputs[k]);
                    if (boxInfo[k][j][i] == 1) {
                        queue.add(new Box(k, j, i));
                        ripenTomatoCnt++;
                        checked[k][j][i] = 0;
                    } else if (boxInfo[k][j][i] == -1) {
                        emptyBoxCnt++;
                        checked[k][j][i] = -2;
                    }
                }
            }
        }
    }
 
    public boolean checkSolution() {
        return ((m * n * h - emptyBoxCnt) == ripenTomatoCnt) ? true : false;
    }
 
    public static void main(String[] args) {
        Tomato_7569 main = new Tomato_7569();
        try {
            main.inputData();
            if (main.checkSolution()) {
                System.out.println(1);
            } else {
                int minDay = main.getMinDay();
                if (main.checkSolution()) {
                    System.out.println(minDay);
                } else {
                    System.out.println("-1");
                }
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

