import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Colarpaper_2563 {
    
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int map[][]=new int[100][100];
        StringTokenizer st = null;
        int cnt=0;
        
        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine()); 
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x ; j <x+10 ; j++){
                for(int k = y; k<y+10 ; k++){
                    if(x<100&&y<100){
                        if(map[j][k]==1){
                            continue;
                        }
                        map[j][k]=1;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        
    }
}