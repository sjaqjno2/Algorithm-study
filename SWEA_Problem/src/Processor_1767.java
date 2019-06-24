import java.util.*;
 
public class Processor_1767 {
    public static int T;
    public static int N;
    public static int[][] Map = new int[12][12];
    public static ArrayList<int[]> processor = new ArrayList<int[]>();    //���μ��� ��ǥ 
    public static int[] result = new int[13];    // i :����� �ھ� ���� . [i] :����� ���� ����   
    public static int Max_power;    // �ִ� ����� �ھ� 
    public static int[][] d = { {-1, 0}, {1, 0}, {0, 1}, {0, -1} };
    
    public static void DFS(int depth, int power, int plus) {
        if(depth == N) {
            if(power >= Max_power) {
                Max_power = power;
                if(result[power] > plus) {
                    result[power] = plus;
                }
            }
            return;
        }
        int i = processor.get(depth)[0];
        int j = processor.get(depth)[1];
        if(i == 0 || i == N-1 || j == 0 || j == N-1) {
            DFS(depth + 1, power + 1, plus);
            return;
        }
        DFS(depth + 1, power, plus);     // �׳� ���� ���ع���
        for(int k = 0; k < 4; k++) {    // ���� �������� Ȯ���غ��� �����ϱ� 
            int dist = 0;
            switch(k) {
            case 0: {    // up
                dist = i;
                break;
            }
            case 1: {    //down
                dist = N - i - 1;
                break;
            }
            case 2: {    //right
                dist = N - j - 1;
                break;
            }
            case 3: {    //left
                dist = j;
                break;
            }
            }
            boolean is_end = true;
            for(int l = 1; l <= dist; l++) {
                if(Map[i + l * d[k][0]][j + l * d[k][1]] != 0)
                    is_end = false;
            }
            if(is_end) {
                for(int l = 1; l <= dist; l++) {
                    Map[i + l * d[k][0]][j + l * d[k][1]] = 2;
                }
                DFS(depth + 1, power + 1, plus + dist);
                
                for(int l = 1; l <= dist; l++) {
                    Map[i + l * d[k][0]][j + l * d[k][1]] = 0;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int t = 1; t <= T; t++) {
            N = sc.nextInt();
            Max_power = 0;
            for(int i = 0; i <= N; i++)
                result[i] = 144;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    Map[i][j] = sc.nextInt();
                    if(Map[i][j] == 1) {
                        int[] p = new int[2];
                        p[0] = i;
                        p[1] = j;
                        processor.add(p);
                    }
                }
            }
            DFS(0, 0, 0);
            System.out.println("#" + t + " " + result[Max_power]);
            processor.clear();
        }
    }
}
