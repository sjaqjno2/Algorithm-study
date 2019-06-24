import java.io.*;

public class Stair_2579 {
    
    static int a[]=new int[301];
    static int d[]=new int[301];
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= n ; i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        
        d[1]=a[1];
        d[2]=a[2]+a[1];
        d[3]=a[3]+Math.max(a[1], a[2]);
        for(int i = 4 ; i <= n ; i++){
            d[i]=a[i]+Math.max(d[i-2], d[i-3]+a[i-1]);
        }
        
        System.out.println(d[n]);
    }
    
}
