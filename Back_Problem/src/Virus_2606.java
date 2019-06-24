import java.io.*;
import java.util.StringTokenizer;

public class Virus_2606 {
	static int visited[];
	static int n, c;
	static int adj[][];
	static int cnt = 0;
	
	public static void main(String args[]) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		adj = new int [n+1][n+1];
		visited = new int[n+1];
		
		for(int i=1; i<=c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			adj[a][b] = 1;
			adj[b][a] = 1;
		}
		
		dfs(1);
		System.out.println(cnt);
	}
	
	static void dfs(int start) {
		visited[start] = 1;
		
		for(int i=1; i<=n; i++) {
			if(adj[start][i]==1 && visited[i] == 0) {
				dfs(i);
				cnt++;
			}
		}
	}

}
