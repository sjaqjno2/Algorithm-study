import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Treasure_2589 {
 
    static int n,m,x,y,ax,ay;
    static int map[][]=new int[50][50];
    static int max=0;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int tmp[][];
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n ; i++){
            String s=br.readLine();
            for(int j = 0 ; j < m ; j++){
                map[i][j]=s.charAt(j);
            }
        }
        
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j++){
                if(map[i][j]=='L'){
                    tmp=new int[n][m];
                    bfs(i,j);
                }
            }
        }
 
        System.out.println(max);
    }
    public static void bfs(int a, int b){
        Queue<Nodea> q = new LinkedList();
        q.add(new Nodea(a,b));
        while(!q.isEmpty()){
            x = q.peek().x;
            y = q.poll().y; 
            for(int i = 0 ; i < 4 ; i++){
                ax = x+dx[i];
                ay = y+dy[i];
                if(ax>=0&&ay>=0&&ax<n&&ay<m){
                    if(map[ax][ay]=='L'){
                        if(tmp[ax][ay]==0||tmp[ax][ay]>tmp[x][y]+1){
                            tmp[ax][ay]=tmp[x][y]+1;
                            if(tmp[ax][ay]>max){
                                max = tmp[ax][ay];
                            }
                            q.add(new Nodea(ax,ay));
                        }
                    }
                }
            }
        }
    }
}

class Nodea{
    int x;
    int y;
    Nodea(int _x, int _y){
        x=_x;
        y=_y;
    }
}
