import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Height_2458 {
    static final int INF = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean dis[][] =new boolean [N+1][N+1];
        for(int i =0; i < M ; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dis[a][b]=true;
        }
        for(int k = 1 ; k <= N;k++){
            for(int i = 1; i<=N;i++){
                for(int j = 1; j <=N;j++){
                    if(dis[i][k] &&dis[k][j]) dis[i][j]=true;
                }
            }
        }
        int total=0;
        for(int i =1 ; i<=N;i++){
            int cnt =0;
            for(int j = 1; j <=N;j++){
                if( i == j )continue;
                if(dis[i][j]||dis[j][i]){
                    cnt++;
                }
            }
            if(cnt==N-1)total++;
        }
        System.out.println(total);
    }
}
