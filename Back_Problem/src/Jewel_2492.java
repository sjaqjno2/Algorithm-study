import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jewel_2492 {
	static int arr[][];
	static int N;
	static int M;
	static int K;
	static int cnt;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String str[] = new String[4];
		String num[] = new String[2];
		str = br.readLine().split(" ");
		 N = Integer.parseInt(str[0]);
		 M = Integer.parseInt(str[1]);
		int T = Integer.parseInt(str[2]);
		 K = Integer.parseInt(str[3]);
		
		arr = new int[M+1][N+1];
		int x, y;
		int max = 0;
		int ans = 0;
		
		
		
		for(int i=0; i<T; i++) {
			num = br.readLine().split(" ");
			x = Integer.parseInt(num[0]);
			y = Integer.parseInt(num[1]);
			arr[y][x] = 1;
		}
		
		
		for(int j=0; j<=N; j++) {
			for(int i=0; i<=M; i++) {
				dfs(i, j);
				ans = cnt;
				if(max<ans) {
					max = ans;				
				}
			}
		}		
		System.out.println(max);
	}
	
	static void dfs(int a, int b) {
		cnt = 0;
		for(int i=0; i<=K; i++) {
			for(int j=0; j<=K; j++) {

				if(a+i<=M && b+j<=N) { 

					if(arr[a+i][b+j] == 1) {
					cnt++;

					}
				}
			}
		}
	}

}
