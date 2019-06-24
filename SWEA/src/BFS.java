import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	static boolean visited[];
	static boolean edge[][];
	static int N;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		
		visited = new boolean[N+1];
		edge = new boolean[N+1][N+1];
		
		for(int i=1; i<=M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			edge[v1][v2] = edge[v2][v1] =  true;
		}
		
		for(int i=1; i<=N; i++)
			visited[i] = false;
		
		bfs(V);
		
	}
	
	
	
	public static void bfs(int cur) {
		Queue<Integer> que = new LinkedList<>();
		visited[cur] = true;
		que.add(cur);
		
		while(!que.isEmpty()) {
			int here = que.remove();
			System.out.print(String.valueOf(here) + ' ');
			
			for(int i=1; i<=N; i++) {
				if(visited[i] || !edge[here][i])
					continue;
				visited[i] = true;
				que.add(i);
			}
		}
	}


}
